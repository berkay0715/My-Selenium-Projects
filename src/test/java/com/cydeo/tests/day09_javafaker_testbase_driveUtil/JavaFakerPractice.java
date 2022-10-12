package com.cydeo.tests.day09_javafaker_testbase_driveUtil;

import com.github.javafaker.Faker;
import org.testng.annotations.Test;

public class JavaFakerPractice {

    @Test
    public void test1(){

        //Creating Faker object to reach methods
    Faker faker = new Faker();
    //Faker faker = new Faker(new Local("fr"));

        System.out.println("faker.name().firstName() = " + faker.name().firstName());
        System.out.println("faker.name().lastName() = " + faker.name().lastName());

        System.out.println("faker.name().fullName() = " + faker.name().fullName());

        //numerify method will generate random numbers in a format we want to get
        System.out.println("faker.numerify(\"###-###-####\") = " + faker.numerify("###-###-####"));

        System.out.println("faker.numerify(\"+46-76-#######\") = " + faker.numerify("+46-76-#######"));

        // letterify() method will return random letters where we pass "?"
        System.out.println("faker.letterify(\"???-????\") = " + faker.letterify("???-????"));

        // bothify() method will return numbers and letters together
        System.out.println("faker.bothify(\"##?#-##?#-#?#?-##??\") = " + faker.bothify("##?#-##?#-#?#?-##??"));


        System.out.println("faker.finance().creditCard() = " + faker.finance().creditCard().replaceAll("-",""));

        System.out.println("faker.chuckNorris().fact() = "
                + faker.chuckNorris().fact().replaceAll("Chuck Norris","Muhtar"));

    }

}
