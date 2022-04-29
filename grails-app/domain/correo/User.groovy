package correo

class User {

    String firstName //Varchar(50)
    String middleName //Varchar(50)
    String lastName //Varchar(50)
    String mobile //Varchar(15)
    String email //Varchar(50)
    String passwordHash //Varchar(32)
    Date registeredAt = new Date() //DATETIME
    Date lastLogin = new Date() //DATETIME
    String intro //TINYTEXT
    String profile //TEXT
    
    static constraints = {
        firstName(nullable:true)
        middleName(nullable:true)
        lastName(nullable:true)
        mobile(nullable:true)
        email(nullable:true)
        passwordHash (nullable: false, unique: true)
        registeredAt (nullable: false, unique: true)
        lastLogin (nullable:true)
        intro(blank:true, nullable:true)
        profile(blank:true, nullable:true)    
    }
}
