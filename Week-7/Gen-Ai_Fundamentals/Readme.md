# Module 16 – Generative AI Fundamentals 


# 1. Introduction to Generative AI


## What is Generative AI?

Generative AI is an AI technology that can generate new content based on user instructions.

It uses machine learning models called **Large Language Models (LLMs)** to understand patterns and produce human-like responses.


Examples of Generative AI:

- ChatGPT → Text generation
- GitHub Copilot → Code generation
- DALL-E → Image generation
- AI chatbots → Conversation


---

# How Generative AI Works


Basic process:


```
User Prompt

      ↓

AI Model

      ↓

Pattern Understanding

      ↓

Generated Output
```


Example:


Input:

```
Write a Java program to reverse a string.
```


Output:

```
AI generates Java code.
```


---

# Generative AI vs Traditional AI


| Traditional AI | Generative AI |
|---|---|
| Predicts or classifies data | Creates new content |
| Uses existing information | Generates new information |
| Output is usually fixed | Output can vary |
| Example: Spam detection | Example: ChatGPT |


---

# Examples of Traditional AI


## Spam Detection

Input:

```
Email content
```

Output:

```
Spam / Not Spam
```


## Face Recognition

Input:

```
Image
```

Output:

```
Person Identity
```


---

# Examples of Generative AI Applications


## 1. Text Generation

Used for:

- Writing emails
- Creating articles
- Summarizing documents


Example:

```
Generate a project report.
```


---

## 2. Code Generation


AI can:

- Write code
- Explain code
- Debug programs
- Generate test cases


Example:

```
Create a REST API using Spring Boot.
```


---

## 3. Image Creation


AI generates images from text descriptions.


Example:

```
Create an image of a futuristic city.
```


---

## 4. Chatbots


AI chatbots provide:

- Customer support
- Learning assistance
- Personal assistants


---

# History and Evolution of Generative AI


## 1960s – Early Chatbots


The first chatbots were created.

Example:

ELIZA chatbot (1966)


Purpose:

- Simulate human conversation


---

## 2014 – GANs


GAN stands for:

**Generative Adversarial Network**


GANs introduced realistic image generation.


Architecture:


```
Generator

     ↓

Creates Fake Data


Discriminator

     ↓

Checks Real/Fake
```


---

## 2020 – GPT-3


GPT-3 was introduced by OpenAI.


Features:

- Large language understanding
- Text generation
- Code generation


---

## 2022 – ChatGPT


ChatGPT became popular because it provided conversational AI.


Used for:

- Learning
- Coding
- Writing
- Problem solving


---

## GitHub Copilot and Beyond


AI assistants became integrated into development tools.

Examples:

- GitHub Copilot
- AI coding assistants
- AI agents


---

# 2. Context Engineering


## What is Context Engineering?


Context Engineering is the process of providing the right information and environment to an AI model so that it produces better responses.


Simple idea:


```
Better Context

      ↓

Better AI Output
```


Example:


Bad Prompt:

```
Explain Java.
```


Better Context:

```
Explain Java OOP concepts for a beginner with examples.
```


The second prompt provides more context.


---

# Why Context Engineering is Important?


It helps to:

- Improve accuracy
- Reduce incorrect answers
- Provide relevant responses
- Reduce AI hallucinations


---

# Prompt Engineering vs Context Engineering


| Prompt Engineering | Context Engineering |
|---|---|
| Focuses on writing instructions | Focuses on providing complete information |
| Mainly user commands | Includes history, data, instructions |
| Controls the question | Controls the environment |


Example:


Prompt:

```
Explain SQL joins.
```


Context:

```
User is a beginner learning database concepts.
Explain with simple examples.
```


---

# Types of Context in AI


## 1. Instructions Context


Defines what the AI should do.


Example:

```
Act as a Java developer.
```


---

## 2. User Input Context


Information provided by the user.


Example:

```
Create a login API.
```


---

## 3. Conversation History


Previous messages used to maintain continuity.


Example:

```
Remember previous requirements.
```


---

## 4. External Data


Additional information provided from outside sources.


Examples:

- Documents
- Databases
- APIs


---

# Context Window


## What is Context Window?


Context window is the maximum amount of information an AI model can process at one time.


Includes:

- User prompts
- Previous conversation
- Documents
- Instructions


Example:


```
Context Window

--------------------

Prompt

Previous Messages

External Data

--------------------
```


---

# Limitations of Context Window


Problems:

- Too much information reduces accuracy
- Important details may be ignored
- Higher processing cost


Solution:

Provide only relevant information.


---

# 3. Prompt Engineering


## What is Prompt Engineering?


Prompt Engineering is the process of designing effective instructions to get better results from AI models.


A prompt contains:

- Task
- Context
- Requirements
- Output format


---

# Why Prompt Engineering Matters?


It helps developers:

- Get accurate outputs
- Reduce errors
- Improve AI responses
- Automate tasks


---

# Prompt Structure


A good prompt contains:


```
Role

+

Task

+

Context

+

Output Format
```


Example:


```
You are a Java developer.

Create a REST API.

Use Spring Boot.

Provide code with explanation.
```


---

# Prompting Techniques


# 1. Zero-Shot Prompting


The model performs a task without examples.


Example:


```
Translate this sentence into French.
```


No examples are provided.


---

# 2. Few-Shot Prompting


The model receives examples before performing the task.


Example:


```
Example:

Input: Happy
Output: Positive


Input: Sad
Output:
```


AI understands the pattern.


---

# 3. Chain-of-Thought Prompting


The model is asked to reason step-by-step.


Example:


```
Solve this problem step by step.
```


Useful for:

- Mathematics
- Logical reasoning
- Complex problems


---

# Prompt Engineering Best Practices


## 1. Give Clear Instructions


Bad:

```
Create code.
```


Good:

```
Create a Java method to find duplicate numbers in an array.
```


---

## 2. Provide Context


Mention:

- Role
- Background
- Requirements


---

## 3. Specify Output Format


Example:


```
Return the answer in JSON format.
```


---

## 4. Iterate and Improve Prompts


First response may not be perfect.

Improve prompts based on results.


---

# Ethical Considerations in Prompt Engineering


## Avoid Bias

AI may generate biased responses.

Use neutral instructions.


---

## Verify Accuracy

AI responses may contain incorrect information.


Always review outputs.


---

## Protect Privacy

Do not share:

- Passwords
- Personal data
- Confidential information


---

## Responsible AI Usage

Use AI as an assistant, not as a replacement for human judgment.


---

# 4. GitHub Copilot Introduction


## What is GitHub Copilot?


GitHub Copilot is an AI-powered coding assistant that helps developers write code faster.


It works like an:

```
AI Pair Programmer
```


---

# GitHub Copilot Features


It can:

- Suggest code
- Complete functions
- Explain code
- Generate tests
- Improve existing code


---

# How GitHub Copilot Works


```
Developer writes code

        ↓

Copilot analyzes context

        ↓

AI generates suggestion

        ↓

Developer accepts/reviews
```


---

# Supported IDEs


GitHub Copilot supports:

- Visual Studio Code
- Visual Studio
- IntelliJ IDEA
- Neovim


---

# Supported Languages


Examples:

- Java
- Python
- JavaScript
- TypeScript
- C#
- Go


---

# 5. GitHub Copilot Setup


## Installing Copilot in VS Code


Steps:


1. Open VS Code

2. Go to Extensions

3. Search:

```
GitHub Copilot
```

4. Install extension

5. Sign in with GitHub account


---

# First Coding Task with Copilot


Example:


Write a comment:


```
// Create a function to calculate factorial
```


Copilot suggests:


```java
public int factorial(int n){

 if(n==0)
    return 1;

 return n*factorial(n-1);
}
```


---

# 6. GitHub Copilot Core Features


## Code Completion


Copilot automatically suggests code.


Example:

Typing:


```
public class Student
```


Copilot suggests class structure.


---

## Generate Functions from Comments


Example:


Comment:

```
// Method to check palindrome string
```


Copilot generates code.


---

## Generate Documentation


Copilot can create:

- Comments
- README sections
- Documentation


---

## Refactoring Code


Copilot helps improve:

- Code readability
- Performance
- Structure


---

## Creating Test Cases


Example:


```
Generate JUnit tests for this method.
```


Copilot creates test scenarios.


---

# 7. Security and Ethical Considerations


## AI Generated Code Risks


AI code may contain:

- Bugs
- Security vulnerabilities
- Incorrect logic


Always review generated code.


---

# Hallucination Risk


AI may generate:

- Non-existing APIs
- Wrong solutions
- Incorrect explanations


Verification is required.


---

# Licensing and Attribution


Generated code may have licensing concerns.

Developers should:

- Review generated code
- Follow company policies
- Avoid copying copyrighted code blindly


---

# Data Privacy


When using AI tools:

Avoid sharing:

- Private company code
- Passwords
- Sensitive information


---

# Responsible Use of Copilot


Best practices:


 Review every suggestion  
 Test generated code  
 Understand the code before using  
 Follow security guidelines  


---

# 8. GenAI in Software Development


GenAI helps developers in:


| Task | Example |
|---|---|
| Code Generation | Creating functions |
| Debugging | Finding errors |
| Documentation | Writing comments |
| Testing | Creating test cases |
| Learning | Explaining concepts |





