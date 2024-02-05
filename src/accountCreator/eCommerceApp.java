package accountCreator;

public class eCommerceApp 
{
    public static void main(String[] args) 
    {
        User newUser = new User.UserBuilder()
            .firstName ("Marianne")
            .lastName ("Edic")
            .email ("marianne.edic@neu.edu.ph")
            .address ("Room 209, NELD-2")
            .phone ("0945 881 0556")
            .age (20)
            .build();

        System.out.println(newUser.firstName);
        System.out.println(newUser.lastName);
        System.out.println(newUser.email);
        System.out.println(newUser.address);
        System.out.println(newUser.phone);
        System.out.println(newUser.age);
    }  
}
