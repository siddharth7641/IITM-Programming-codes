/*
 * Abstract classes and interfaces
Write a program that takes input to create an array of Trainer objects and prints the incentives of each trainer for their overtime (ot) duty.

Abstract class Trainer has the following members:

String name, String ot and int numhours as private instance variables
constructor to initialize the instance variables
required accessor methods
method toString() to return name of the trainer
abstract method public abstract String incentive()
Class AssistantTrainer is a child class of Trainer, and has the following members:

constructor to initialize the instance variables
method incentive() returns the incentive as numhours * 500, if the type of overtime is "projectot", otherwise it returns the string "Wrong ot assigned"
Class TechnicalTrainer is a child class of Trainer, and has the following members:

constructor to initialize the instance variables
method incentive() returns the incentive as numhours * 750, if the type of overtime is "trainingot", otherwise it returns the string "Wrong ot assigned"
Class AbstractTest has the following members:

method printTrainerincentives that prints the name of each trainer and his / her incentive if the overtime type matches, otherwise it prints the name and the corresponding error message
main method accepts the name, ot and numhours of two AssistantTrainers followed by that of two TechnicalTrainers, and invokes method printTrainerincentives
What you have to do
Define method printTrainerincentives in class AbstractTest
Java documentation can be accessed at: https://docs.oracle.com/en/java/javase/11/docs/api

Note: It has been observed that when there are several concurrent submissions, sometimes we get ClassNotFoundException. In this case, please refresh, try again, and try submitting multiple times.

Template Code(Click to Expand)
 */

public class oppe15 {
    
}
