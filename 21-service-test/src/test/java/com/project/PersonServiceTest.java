package com.project;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.junit.jupiter.api.extension.Extensions;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.jupiter.MockitoExtension;

@Extensions({
        @ExtendWith(MockitoExtension.class)
})
public class PersonServiceTest {

    //kita ingin test service, tetapi service punya ketergantungan terhadap repository
    // Nah untuk repository kita bikin Mock object nya atau tiruan dari yang repository asli
    // caranya dengan menggunakan @Mock, secara otomatis JUnit akan membuatkan Mock object nya
    @Mock
    private PersonRepository personRepository;

    // kita akan test service nya, makanya kita butuh object PersonService
    private PersonService personService;

    @BeforeEach
    void setUp() {
        // kita akan inject mock personRepository ke personService
        personService = new PersonService(personRepository);
    }

    // kita bisa menambahakan behaviour ke mocking object personRepoitory

    @Test
    void testGetNotFound() {
        // pertama-pertama jika kita memanggil apapun ke dalam object mocking maka hasilnya akan null
        // karena kita belum menambahkan behavior ke object mocknya
        // dan defaultnya jika tidak memanggil method apapun, maka return nya null
        // maka bisa langsung di throw exception, tambahkan pesan not found
        // artinya person tidak ditemukan, dan hasilnya akan throw exception
        Assertions.assertThrows(IllegalArgumentException.class, () -> personService.get("not found"));
    }

    @Test
    void testGetSuccess() {
        // menambahkan behavior ke mock object personRepository
        // behavior nya adalah ketika kita selectById("albert"), maka kembalikan data object Person sesuai id yang diinginkan
        Mockito
                .when(personRepository.selectById("albert"))
                .thenReturn(new Person("albert", "Albert Einstein"));

        // jika kita panggil personService, maka data id nya sudah ada yakni "albert"
        var person = personService.get("albert");

        // cek hasilnya harus sesuai
        Assertions.assertEquals("albert", person.getId());
        Assertions.assertEquals("Albert Einstein", person.getName());
    }

    @Test
    void testRegister() {
        // pastikan setiap kali selesai menggunakan mocking object maka harus verifikasi
        // bahwa object mocking yang sudah dipanggil, dan berapa kali dipanggilnya
        var person = personService.register("Issac Newton");
        Assertions.assertEquals("Issac Newton", person.getName());

        // id untuk method Register sudah kita bikin otomatis
        // jadi tidak bisa cocokan menggunakan data id
        // hanya kita pastikan, jika sukses registrasi, maka id nya harusnya tidak null
        Assertions.assertNotNull(person.getId());

        // verifikasi, berapa kali mock object dipanggil, methodnya apa, dan datanya apa

        // karena didalam method register() sebenarnya kita melakukan pemanggil personRepository dengan method insert()
        // makanya kita pastikan bahwa method insert() itu benar-benar dipanggil 1 kali
        Mockito.verify(personRepository, Mockito.times(1))
                .insert(new Person(person.getId(), "Issac Newton"));
    }
}
