import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class ContactServiceTest {
    private ContactService contactService;
    private Contact contact;

    @BeforeEach
    public void setUp() {
        contactService = new ContactService();
        contact = new Contact("12345", "John", "Doe", "1234567890", "123 Main St");
    }

    @Test
    public void testAddContact() {
        contactService.addContact(contact);
        Contact retrievedContact = contactService.getContact("12345");
        assertNotNull(retrievedContact);
        assertEquals("John", retrievedContact.getFirstName());
    }

    @Test
    public void testDeleteContact() {
        contactService.addContact(contact);
        contactService.deleteContact("12345");
        assertNull(contactService.getContact("12345"));
    }

    @Test
    public void testUpdateContact() {
        contactService.addContact(contact);
        contactService.updateContact("12345", "Jane", "Doe", "0987654321", "456 Another St");
        Contact updatedContact = contactService.getContact("12345");
        assertEquals("Jane", updatedContact.getFirstName());
        assertEquals("0987654321", updatedContact.getPhone());
        assertEquals("456 Another St", updatedContact.getAddress());
    }

    @Test
    public void testContactNotFoundForUpdate() {
        assertThrows(IllegalArgumentException.class, () -> contactService.updateContact("99999", "Jane", "Doe", "0987654321", "456 Another St"));
    }

    @Test
    public void testAddContactWithDuplicateId() {
        contactService.addContact(contact);
        assertThrows(IllegalArgumentException.class, () -> contactService.addContact(contact));
    }

    @Test
    public void testDeleteNonExistingContact() {
        assertThrows(IllegalArgumentException.class, () -> contactService.deleteContact("99999"));
    }
}
