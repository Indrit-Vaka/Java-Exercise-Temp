/**
 * By Indrit Vaka
 */
public class Author {
    private String name;
    private String email;
    private char gender; // m or f

    public Author(String name, String email, char gender) {
        this.name = name;
        setEmail(email);
        setGender(gender);
    }

   

    public String getName() {
        return name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {

        //em ex info@indritvaka.com => min 4 karaktere i@i.c 
        //Nje check basik per emailin
        if (email.contains("@") && email.contains(".") &&email.length()>4) {
            this.email = email;
            return;
        }
        throw new IllegalArgumentException("Invalid email!!");
    }

    public char getGender() {
        return gender;
    }

    //Ne metode me vete per te bere kontrollet dhe per nje kod me te paster(organizuar)
    private void setGender(char gender) {

        if (gender == 'M' || gender == 'm'
                || gender == 'F' || gender == 'f') {
            this.gender = gender;
        } else {
            throw new IllegalArgumentException("Gender should be F or M");
        }
    }


    public String toString(){
        return String.format("Author: name=%s, email=%s, gender=%c", name,email, gender);
    }

  
}
