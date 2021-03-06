# Reflections  

## Computer mouse
*Identify the types of testing you would perform on a computer mouse, to
make sure that it is of the highest quality.*

- Does the mouse have basic functionality? left/right click and scroll. 
- Does the form factor of the mouse fit the palm of the intended users hand?
- Is the mouse able to slide over the intended surface (table ect.)?
- Does the laser/tracker work on the intended surfaces?
- If wireless: does it have acceptable battery life?
- If wireless: does it have acceptable range?
- If wired: does it have acceptable cord length?
- 

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
-	There were multiple censors of the airplane that knew the airplane was diving, but not all of them were sending data to the MCAS.
-	The MCAS should have been automatically shut off if its censor data did not match with the rest of the plane.  
-   The FAA/EASA should also have some type of standard/testing of the software in planes. 

Boing has later made an update for the airplane that makes the MCAS “less aggressive”:
- Flight control system will now compare inputs from both (AOA) sensors. If the sensors disagree by 5.5 degrees or more with the flaps retracted, MCAS will not activate. An indicator on the flight deck display will alert the pilots.  
- If MCAS is activated in non-normal conditions, it will only provide one input for each elevated AOA event. There are no known or envisioned failure conditions where MCAS will provide multiple inputs.  
- MCAS can never command more stabilizer input than can be counteracted by the flight crew pulling back on the column. The pilots will continue to always have the ability to override MCAS and manually control the airplane.  
  
These are all edge cases that should have been thought of during QA. 

More in depth here if interrested:    
[Full verge article](https://www.theverge.com/2019/5/2/18518176/boeing-737-max-crash-problems-human-error-mcas-faa)  
[Short vox video](https://www.youtube.com/watch?v=H2tuKiiznsY)  
[Could software-QA have prevented the crashes? itworldcanada](https://www.itworldcanada.com/article/could-software-quality-assurance-processes-have-prevented-the-boeing-737-max-crash/417713)  


## Two Katas  

### String utility - *Look in Testing_StringUtility in this project to see hand in* 
Use TDD to create a string utility with the following methods:  
• Reverse string (aBc -> cBa)  
• Capitalize string (aBc -> ABC)  
• Lowercase string (aBc -> abc)  
  

  
### Bowling game kata - *Look in Testing_BowlingGame in this project to see hand in* 
Complete the Bowling Game Kata using TDD. The slides can be found here:  
http://butunclebob.com/files/downloads/Bowling%20Game%20Kata.ppt  


### Investigation of tools  
##JUnit 5  
*Investigate JUnit 5 (Jupiter). Explain the following, and how they are useful.*  
• **@Tag**  
Tags are used to organize and group tests. eg. @Tag("integration") or @Tag("unit")  
• **@Disabled**  
This is used to disable tests. If eg. requirements change temporarily?  
• **@RepeatedTest**  
Repeats a test. same way as parametherizedTest but with the same data.  
• **@BeforeEach, @AfterEach**  
Does something before/after each test. eg. setting up an object to use for the tests.  
• **@BeforeAll, @AfterAll**  
Does something before/after all tests. eg. setting up an enviroment, connecting to a server og db?  
• **@DisplayName**  
Changes the display name to get a better overview when running all tests.  
• **@Nested**  
Another great way to organize tests. With nested you can group your tests together.   
• **assumeFalse, assumeTrue**  
Assumptions can be used to only continue the test under certain conditions. eg. only run a test on a certain operation system.  

## Mocking frameworks  
*Investigate mocking frameworks for your preferred language. Choose at least
two frameworks, and answer the questions. (One could be Mockito, which
we saw in class.)*  

### I have chosen to look at jMockit and Mockito

• **What are their similarities?**  
Both of them is accepted in the mocking/testing community at good frameworks.  

• **What are their differences?**  
jMockit has a steeper learning curve than Mockito. 
Static method/constructor can be mocked directly in JMockit. and not directly in Mockito  
Mockito has a bigger community than jMockit -> Better helt online  
  
[Google search comparison of frameworks](https://trends.google.com/trends/explore?q=mockito,jmockit,easymock,PowerMock)  
• **Which one would you prefer, if any, and why?**  
jMockit has a wider scope and might be a better mocking framework. But Mockito has a bigger community witch i find better as a beginner.  
We have allready been taught a bit of Mockinto and it seems to be a simple and popular framework. So i would choose Mockinto as a "starter" framework     
