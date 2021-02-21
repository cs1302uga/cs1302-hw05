# cs1302-hw05 Lovable Linked Lists 

![Approved for: Spring 2021](https://img.shields.io/badge/Approved%20for-Spring%202021-success)

This class exercise explores how to work with nodes commonly used in linked lists. 

## Prerequisite Knowledge

* [CSCI 1302 Reference Variable Refresher](https://github.com/cs1302uga/cs1302-tutorials/blob/master/refresher/variables.md)

## Course-Specific Learning Outcomes

* **LO1.d:** Use shell commands to compile new and existing software solutions that are organized into 
multi-level packages and have external dependencies.
* **LO7.c:** (Partial) Use common abstract data types and structures, including lists, queues, arrays, 
and stacks in solving typical problems.  Generate user-facing API documentation for a software solution.

## Questions

In your notes, clearly answer the following questions. These instructions assume that you are 
logged into the Odin server. 

**NOTE:** For each step, please provide in your notes the full command that you typed to make the related 
action happen along with an explanation of why that command worked. Some commands require multiple options. 
It is important to not only recall what you typed but also why you typed each of them. If context is necessary 
(e.g., the command depends on your present working directory), then please note that context as well.
You won't need to submit your notes in your final submission. However, if done properly, your exercise notes 
will serve as a helpful study guide for the exam.

## Exercise Steps

### Checkpoint 1 Steps - Getting Started

1. Use Git to clone the repository for this exercise onto Odin into a subdirectory called `cs1302-hw05`:

   ```
   $ git clone --depth 1 https://github.com/cs1302uga/cs1302-hw05.git
   ```

1. Change into the `cs1302-hw05` directory that was just created and look around. You should see a `Node` class
   in the `src` directory. This class is very similar to the `Node` class used in the
   [ADT and Links Tutorial](https://github.com/cs1302uga/cs1302-tutorials/blob/master/adt-and-links/adt-and-links.md)

   <!-- Use the following to download the JAR file that accompanies your `cs1302-phased-list` project:
   
   ```
   $ wget ##INSERT LINK HERE
   ```
   
   **NOTE:** This is a separate download. When you followed (or follow) the instructions provided
   in the project description for how to download the project, you will automatically get a copy of
   the JAR file that you can use with the project.
   -->
   
1. For convenience, here is a link to the 
   [`Node` API Documentation](https://webwork.cs.uga.edu/~bjb211/node-doc/cs1302/hw05/Node.html).
   What is the FQN of the _package_ that contains `Node`?

1. Consider the following example code snippet:
   
   ```java
   Node example = null;                 // line 1
   example = new Node("Hello");         // line 2
   example.setNext(new Node("World"));  // line 3
   ```
   
   **We can illustrate this snippet by drawing a diagram for the first line**, 
   then **redrawing the entire driagram after subsequent lines.** Here are the 
   three corresponding diagrams, one for each line in the example:
   
   ```
   // after line 1
   example = null
   ```
   
   ```
   // after line 2
                   /----------------\
   example ------->| item -> "Hello"|
                   | next = null    |
                   \----------------/
   ```
   
   ```
   // after line 3
                   /----------------\       /----------------\
   example ------->| item -> "Hello"|   /-->| item -> "World"|
                   | next ----------|--/    | next = null    |
                   \----------------/       \----------------/
   ```
   
1. Create a `Driver` program using the code below but **don't run it yet**. Make sure you place the file in the proper directory within `src`. 
   Before running the code, we want you to trace through it (illustrate it, like we did above) carefully to make sure you understand it. 

   * For _each line_ in **`CODE BLOCK 1`, `CODE BLOCK 2`, and `CODE BLOCK 3`** (only these three blocks for now), draw a diagram that 
     illustrates any nodes that have been created along with their associated `item` and `next` references. 
     Since `next` is a reference, you would either need to denote it as `null` or draw an arrow to 
     the object it references. **Redraw the entire picture after each line.** Here are some things
     to note:
   
        * Although the associated string is also a reference, you may draw it within the node. 
        * Number each step in your notes. There are 7 lines among `CODE BLOCK 1`, `CODE BLOCK 2`, and `CODE BLOCK 3`,
          so we expect 7 steps/diagrams in your notes for this part. 
        * Reference variables that are not contained in node objects (e.g., `a`, `b`, and `c`) 
          should also be included in the diagram.
          
        ```java
        package cs1302.hw05;

        public class Driver {
   
            public static void main(String[] args) {

                // CODE BLOCK 1
                Node a = new Node("Joe");
                a.setItem("Billy");
        
                // CODE BLOCK 2
                new Node("Linda", a);
        
                // CODE BLOCK 3
                Node b = new Node("Juno");
                b.setNext(a);
                a.setNext(new Node("Sally"));
                b.getNext().getNext().setNext(new Node("Barry"));
        
                // CODE BLOCK 4
                Node c = b.getNext().getNext();
                c.getNext().setNext(new Node("Simon"));

                // CODE BLOCK 5
                System.out.println(c.getNext().getNext().getNext());
                System.out.println(b.getItem());
                System.out.println(a.getNext().getNext().getItem());
                System.out.println(c.getNext().getNext().getItem());

                // CODE BLOCK 6
                a.setNext(new Node("Simone"));

                // CODE BLOCK 7
                System.out.println(a.getNext().getNext());
        
            } // main

        } // Driver
        ```

1. For this checkpoint (code blocks 1-3), there is no output. However, we've provided the sample
   solutions for the exercise so far in [CP1.md](CP1.md). Please check your answers closely and
   fix any discrepancies before moving on to the next checkpoint.
   
<hr/>

![CP](https://img.shields.io/badge/Just%20Finished%20Checkpoint-1-success?style=for-the-badge)

<hr/>

### Checkpoint 2 Steps

1. **Please read this entire bullet point, including sub-bullets, before continuing.**
   For _each line_ in **`CODE BLOCK 4`, `CODE BLOCK 5`, `CODE BLOCK 6`, and `CODE BLOCK 7`**, 
   draw a diagram that illustrates any nodes that have been created along with their associated 
   `item` and `next` references. Like before, **redraw the entire picture after each line.** 
   Here are some things to note:
   
   * Number each step in your notes, starting with 8 (which is the first line in `CODE BLOCK 4`).
     There are 8 lines among `CODE BLOCK 4`, `CODE BLOCK 5`, `CODE BLOCK 6`, and `CODE BLOCK 7`,
     so we expect 8 steps in your notes for this part.
   * If a line contains a `println` statement, then you can simply write its output.

1. Before running the application, write the expected output in your notes.

1. Make sure you are in the `cs1302-hw05` directory. In your notes, write the exact command to:
   1. Compile `Driver.java` specifying `bin` as the default package location for your compiled code.
   1. Run `cs1302.list.Driver`.
   
<!--   **NOTE:** This program depends on two different sets of compiled code: i) the compiled code you placed
   into `bin`; and ii) the compiled code in the JAR file. You will need to place the paths to the default 
   package locations for both on the class path in order to run your program. -->
   
1. Write the output from the program in your notes. If your output for lines 10, 11, 12, and 13 (from
   `CODE BLOCK 5`) and line 17 (from `CODE BLOCK 7`) does not match the output from the 
   program execution, then make a note of it, then try to fix your diagrams and output 
   before claiming this checkpoint.
   
1. Add the actual output from running the application to your `SUBMISSION.md` file as explained in 
   the submission instructions below. 
   
<hr/>

![CP](https://img.shields.io/badge/Just%20Finished%20Checkpoint-2-success?style=for-the-badge)

<hr/>

### Checkpoint 3 Steps

1. In `Driver.java`, remove the last two Java instructions (code blocks 6 and 7) from the `main` method. 
   These two lines are:

   ```java
   // CODE BLOCK 6                                                                                                                                               
   a.setNext(new Node("Simone"));

   // CODE BLOCK 7                                                                                                                                               
   System.out.println(a.getNext().getNext());
   ```

1. In `Driver.java`, add a method to print the string value of an arbitrary `Node` starting from
   some specified `Node`. **Below is the signature for the method you should implement,** including
   some Javadoc documentation. You do **NOT** need to explicitly create and `throw` the `NullPointerException`
   mentioned in the comment (it should get thrown automatically under the described condition). 
   
   ```java
   /**
    * Prints the string value for a node. Starting with {@code node}, this method attempts
    * to traverse {@code numLinks}-many {@code getNext()} links, then prints the result of 
    * calling {@code getItem()} on the very last node in its traversal. 
    *
    * @param node      starting node
    * @param numLinks  number of links to traverse
    * @throws NullPointerException when an attempt is made to call {@code getItem()} or
    *         {@code getNext()} using a {@code null} reference.
    */
   public static void printNode(Node node, int numLinks) {
       ...
   } // printNode
   ```
   
1. In your notes, write down the expected output the following lines of code, 
   assuming they're placed in the `main` method after all of the existing lines of code:
   
   ```java
   printNode(a, 1);
   printNode(b, 2);
   printNode(c, 0);
   printNode(a.getNext(), 0);
   printNode(c.getNext(), 3);
   ```

1. At the end of the `main` method of `Driver.java`, add the following lines of code
   if you haven't already:
   
   ```java
   printNode(a, 1);
   printNode(b, 2);
   printNode(c, 0);
   printNode(a.getNext(), 0);
   printNode(c.getNext(), 3);
   ```
      
1. Compile and run your `Driver` program and make sure all code in the `src` directory passes the `checkstyle` audit.

1. Write the output from the program in your notes. If your expected output does not match the output from the 
   program execution, indicate the reason(s) in your notes.

1. **NOTE:** You do not need to include the output of this step in your `SUBMISSION.md` file as we will be able to run the program to see the output.

<hr/>

![CP](https://img.shields.io/badge/Just%20Finished%20Checkpoint-3-success?style=for-the-badge)

<hr/>

### Submission Steps

**Each student needs to individually submit their own work.**

1. Create a plain text file called `SUBMISSION.md` directly inside the `cs1302-hw05`
   directory with the following information:

   1. Your name and UGA ID number; and
   1. The full output of the application at the end of checkpoint 2 (before the step 3 modifications).
  
   Here is an example of the contents of `SUBMISSION.md`.
   
   ```
   Sally Smith (811-000-999)
   output line 1
   output line 2
   output line 3
   ...
   output line n
   ```

1. Change directories to the parent of `cs1302-hw05` (e.g., `cd ..` from `cs1302-hw05`). If you would like
   to make a backup tar file, the instructions are in the submissions steps for [hw01](https://github.com/cs1302uga/cs1302-hw01).
   We won't repeat those steps here and you can view them as optional.
   
1. Use the `submit` command to submit this exercise to `csci-1302`:
   
   ```
   $ submit cs1302-hw05 csci-1302
   ```
   
   Read the output of the submit command very carefully. If there is an error while submitting, then it will displayed 
   in that output. Additionally, if successful, the submit command creates a new receipt file in the directory you 
   submitted. The receipt file begins with rec and contains a detailed list of all files that were successfully submitted. 
   Look through the contents of the rec file and always remember to keep that file in case there is an issue with your submission.

   **Note:** You must be on Odin to submit.

<hr/>

![CP](https://img.shields.io/badge/Just%20Finished-Submission-success?style=for-the-badge)

<hr/>

[![License: CC BY-NC-ND 4.0](https://img.shields.io/badge/License-CC%20BY--NC--ND%204.0-lightgrey.svg)](http://creativecommons.org/licenses/by-nc-nd/4.0/) [![License: CC BY-NC 4.0](https://img.shields.io/badge/Instructor%20License-CC%20BY--NC%204.0-lightgrey.svg)](http://creativecommons.org/licenses/by-nc/4.0/)

<small>
Copyright &copy; Michael E. Cotterell, Bradley J. Barnes, and the University of Georgia.
This work is licensed under 
a <a rel="license" href="http://creativecommons.org/licenses/by-nc-nd/4.0/">Creative Commons Attribution-NonCommercial-NoDerivatives 4.0 International License</a> to students and the public and licensed under
a <a rel="license" href="http://creativecommons.org/licenses/by-nc/4.0/">Creative Commons Attribution-NonCommercial 4.0 International License</a> to instructors at institutions of higher education.
The content and opinions expressed on this Web page do not necessarily reflect the views of nor are they endorsed by the University of Georgia or the University System of Georgia.
</small>
