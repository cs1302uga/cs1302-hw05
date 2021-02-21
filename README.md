# cs1302-ce11 Lovable Linked Lists 

![Approved for: Fall 2020](https://img.shields.io/badge/Approved%20for-Fall%202020-blueviolet)

> Roses are red. 
> Violets are blue. 
> `error: ';' expected` in `Driver.java` on line `142`.

This class exercise explores how to work with nodes commonly used in linked lists. 

## Prerequisite Knowledge

* [CSCI 1302 Reference Variable Refresher](https://github.com/cs1302uga/cs1302-tutorials/blob/master/refresher/variables.md)
* [`StringList.Node` API Documentation](http://cobweb.cs.uga.edu/~mec/cs1302/listadt-api/cs1302/listadt/StringList.Node.html)

## Course-Specific Learning Outcomes

* **LO1.d:** Use shell commands to compile new and existing software solutions that are organized into 
multi-level packages and have external dependencies.
* **LO7.c:** (Partial) Use common abstract data types and structures, including lists, queues, arrays, 
and stacks in solving typical problems.  Generate user-facing API documentation for a software solution.

## Questions

In your notes, clearly answer the following questions. These instructions assume that you are 
logged into the Odin server. 

**NOTE:** If a step requires you to enter in a command, please provide in your notes the full 
command that you typed to make the related action happen. If context is necessary (e.g., the 
command depends on your present working directory), then please note that context as well.

## Exercise Steps

### Checkpoint 1 Steps - Getting Started

1. Use Git to clone the repository for this exercise onto Odin into a subdirectory called `cs1302-ce11`:

   ```
   $ git clone --depth 1 https://github.com/cs1302uga/cs1302-ce11.git
   ```

1. Change into the `cs1302-ce11` directory that was just created and look around. There should be
   almost nothing there! That's okay. Use the following to download the JAR file that accompanies your
   `cs1302-listadt` project:
   
   ```
   $ wget https://github.com/cs1302uga/cs1302-listadt/raw/master/listadt.jar
   ```
   
   **NOTE:** This is a separate download. When you followed (or follow) the instructions provided
   in the project description for how to download the project, you will automatically get a copy of
   the JAR file that you can use with the project.

1. For convenience, here is a link to the 
   [`StringList.Node` API Documentation](http://cobweb.cs.uga.edu/~mec/cs1302/listadt-api/cs1302/listadt/StringList.Node.html).
   What is the FQN of the _package_ that contains `StringList.Node`?

1. Create a `Driver` program using the code below. Make sure you place the file in the proper directory
   within `src`.

   ```java
   package cs1302.list;

   import cs1302.listadt.StringList;

   public class Driver {
   
       public static void main(String[] args) {

           // CODE BLOCK 1
           StringList.Node a = new StringList.Node();
           a.setStr("Billy");
        
           // CODE BLOCK 2
           new StringList.Node("Linda", a);
        
           // CODE BLOCK 3
           StringList.Node b = new StringList.Node("Juno");
           b.setNext(a);
           a.setNext(new StringList.Node("Sally"));
           b.getNext().getNext().setNext(new StringList.Node("Barry"));
        
           // CODE BLOCK 4
           StringList.Node c = b.getNext().getNext();
           c.getNext().setNext(new StringList.Node("Simon"));

           // CODE BLOCK 5
           System.out.println(c.getNext().getNext().getNext());
           System.out.println(b.getStr());
           System.out.println(a.getNext().getNext().getStr());
           System.out.println(c.getNext().getNext().getStr());

           // CODE BLOCK 6
           a.setNext(new StringList.Node("Simone"));

           // CODE BLOCK 7
           System.out.println(a.getNext().getNext());
        
       } // main

   } // Driver
   ```

1. **Please read this entire bullet point, including sub-bullets, before continuing.**
   Consider the following example code snippet:
   
   ```java
   StringList.Node example = null;                 // line 1
   example = new StringList.Node("Hello");         // line 2
   example.setNext(new StringList.Node("World"));  // line 3
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
   example ------->| str -> "Hello" |
                   | next = null    |
                   \----------------/
   ```
   
   ```
   // after line 3
                   /----------------\       /----------------\
   example ------->| str -> "Hello" |   /-->| str -> "World" |
                   | next ----------|--/    | next = null    |
                   \----------------/       \----------------/
   ```

   Now, for _each line_ in **`CODE BLOCK 1`, `CODE BLOCK 2`, and `CODE BLOCK 3`**, draw a diagram that 
   illustrates any nodes that have been created along with their associated `str` and `next` references. 
   Since `next` is a reference, you would either need to denote it as `null` or draw an arrow to 
   the object it references. **Redraw the entire picture after each line.** Here are some things
   to note:
   
   * Although the associated string is also a reference, you may draw it within the node. 
   * Number each step in your notes. There are 7 lines among `CODE BLOCK 1`, `CODE BLOCK 2`, and `CODE BLOCK 3`,
     so we expect 7 steps/diagrams in your notes for this part. 
   * Reference variables that are not contained in node objects (e.g., `a`, `b`, and `c`) 
     should also be included in the diagram.

   **Really, redraw the entire picture after each line.** 
   If you're unsure what we mean, then ask.   

<hr/>

![CP](https://img.shields.io/badge/Just%20Finished%20Checkpoint-1-success?style=for-the-badge)

<hr/>

### Checkpoint 2 Steps

1. **Please read this entire bullet point, including sub-bullets, before continuing.**
   For _each line_ in **`CODE BLOCK 4`, `CODE BLOCK 5`, `CODE BLOCK 6`, and `CODE BLOCK 7`**, 
   draw a diagram that illustrates any nodes that have been created along with their associated 
   `str` and `next` references. Like before, **redraw the entire picture after each line.** 
   Here are some things to note:
   
   * Number each step in your notes, starting with 8 (which is the first line in `CODE BLOCK 4`).
     There are 8 lines among `CODE BLOCK 4`, `CODE BLOCK 5`, `CODE BLOCK 6`, and `CODE BLOCK 7`,
     so we expect 8 steps in your notes for this part.
   * If a line contains a `println` statement, then you can simply write its output.
   
1. Make sure you are in the `cs1302-ce11` directory. Write the exact command to:
   1. Compile `Driver.java` specifying `bin` as the default package location for your compiled code.
   1. Run `cs1302.list.Driver`.
   
   **NOTE:** This program depends on two different sets of compiled code: i) the compiled code you placed
   into `bin`; and ii) the compiled code in the JAR file. You will need to place the paths to the default 
   package locations for both on the class path in order to run your program.

1. Write the output from the program in your notes. If your output for lines 10, 11, 12, and 13 (from
   `CODE BLOCK 5`) and line 17 (from `CODE BLOCK 7`) does not match the output from the 
   program execution, then make a note of it, then try to fix your diagrams and output 
   before claiming this checkpoint.
   
<hr/>

![CP](https://img.shields.io/badge/Just%20Finished%20Checkpoint-2-success?style=for-the-badge)

<hr/>

### Checkpoint 3 Steps

1. In `Driver.java`, remove the last two Java instructions from the `main` method.

1. In `Driver.java`, add a method to print the string value of an arbitrary `StringList.Node` starting from
   some specified `StringList.Node`. **Below is the signature for the method you should implement,** including
   some Javadoc documentation. You do **NOT** need to explicitly create and `throw` the `NullPointerException`
   mentioned in the comment (it should get thrown automatically under the described condition). 
   
   ```java
   /**
    * Prints the string value for a node. Starting with {@code node}, this method attempts
    * to traverse {@code numLinks}-many {@code getNext()} links, then prints the result of 
    * calling {@code getStr()} on the very last node in its traversal. 
    *
    * @param node      starting node
    * @param numLinks  number of links to traverse
    * @throws NullPointerException when an attempt is made to call {@code getStr()} or
    *         {@code getNext()} using a {@code null} reference.
    */
   public static void printNode(StringList.Node node, int numLinks) {
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
      
1. Compile and run your `Driver` program. Then, make sure it passes the `checkstyle` audit.

1. Write the output from the program in your notes. If your expected output does not match the output from the 
   program execution, indicate the reason(s) in your notes.

<hr/>

![CP](https://img.shields.io/badge/Just%20Finished%20Checkpoint-3-success?style=for-the-badge)

<hr/>

[![License: CC BY-NC-ND 4.0](https://img.shields.io/badge/License-CC%20BY--NC--ND%204.0-lightgrey.svg)](http://creativecommons.org/licenses/by-nc-nd/4.0/) [![License: CC BY-NC 4.0](https://img.shields.io/badge/Instructor%20License-CC%20BY--NC%204.0-lightgrey.svg)](http://creativecommons.org/licenses/by-nc/4.0/)

<small>
Copyright &copy; Michael E. Cotterell, Bradley J. Barnes, and the University of Georgia.
This work is licensed under 
a <a rel="license" href="http://creativecommons.org/licenses/by-nc-nd/4.0/">Creative Commons Attribution-NonCommercial-NoDerivatives 4.0 International License</a> to students and the public and licensed under
a <a rel="license" href="http://creativecommons.org/licenses/by-nc/4.0/">Creative Commons Attribution-NonCommercial 4.0 International License</a> to instructors at institutions of higher education.
The content and opinions expressed on this Web page do not necessarily reflect the views of nor are they endorsed by the University of Georgia or the University System of Georgia.
</small>
