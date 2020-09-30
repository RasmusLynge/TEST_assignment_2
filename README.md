# Reflections  

## Computer mouse
*Identify the types of testing you would perform on a computer mouse, to
make sure that it is of the highest quality.*


## Catastrophic failure
*Find a story where a software system defect had a bad outcome. Describe
what happened. Can you identify a test that would have prevented it?*
  
The worst software defect I have ever heard about is the one of the Boeing 737 Max airplane that ended up costing the lives of 346 people.   
  
During testing the airplane had some issues with the nose pointing too much upwards. Boing wanted the new plane to behave as the previous models so that the pilots wouldn’t need extra training to fly the new plane. They fixed this “nose problem” with a software that automatically pushed the nose down if the nose was at too high of an angle (MCAS-software).
The MCAS basically ignored the pilots input and pushed the nose downwards if its censors detected that the nose was at too high of an angle.   
Since its launch several pilots complained that the nose of the plane was suddenly tipping down for no reason. They had gotten no training in the new MCAS-software and was not aware that it was installed. Two planes ended up crashing due to uncontrollable nosedives created by the MCAS.  

The FAA and EASA(Federal Aviation Administration and European Union Aviation Safety Agency) that tests and approves the airplanes has admitted to being incompetent when regulating software, and, as a policy, it allows plane manufacturers to police themselves for safety. (Said in 2019)

There are multiple places where this went wrong. Rushed certifications, promising minimal training for the pilots and much more. 
From a testing perspective the MCAS should have been tested better to make sure it would have turned off before making the plane go into a free fall. 
-	There were multiple censors of the airplane that knew the airplane was diving, but none of them were sending data to the MCAS.
-	The MCAS should have been automatically shut off if its censor data did not match with the rest of the plane.  
-   The FAA/EASA should also have some type of standard/testing of the software in planes. 

Boing has later made an update for the airplane that makes the MCAS “less aggressive” and EASA plans to lift the flight ban from the plane from November this year.
  
  
More in depth:    
https://www.theverge.com/2019/5/2/18518176/boeing-737-max-crash-problems-human-error-mcas-faa  
https://www.youtube.com/watch?v=H2tuKiiznsY  


## Two Katas  

#### String utility  

Use TDD to create a string utility with the following methods:  
• Reverse string (aBc -> cBa)  
• Capitalize string (aBc -> ABC)  
• Lowercase string (aBc -> abc)  
  
  
#### Bowling game kata
Complete the Bowling Game Kata using TDD. The slides can be found here:  
http://butunclebob.com/files/downloads/Bowling%20Game%20Kata.ppt  
Investigation of tools  
JUnit 5  
Investigate JUnit 5 (Jupiter). Explain the following, and how they are useful.  
• @Tag  
• @Disabled  
• @RepeatedTest  
• @BeforeEach, @AfterEach  
• @BeforeAll, @AfterAll  
• @DisplayName  
• @Nested  
• assumeFalse, assumeTrue  
Mocking frameworks  
Investigate mocking frameworks for your preferred language. Choose at least
two frameworks, and answer the questions. (One could be Mockito, which
we saw in class.)  
• What are their similarities?  
• What are their differences?  
• Which one would you prefer, if any, and why?  

- - -# TEST_assignment_2