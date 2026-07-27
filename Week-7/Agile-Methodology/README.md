# Module 14 – Agile Methodology 

# 1. Introduction to Agile

## What is Agile?

Agile is an approach to software development where teams build software in **small, frequent releases** instead of delivering the entire product at once.

Agile focuses on:

- Customer collaboration
- Quick feedback
- Continuous improvement
- Adapting to changes


### Example:

Suppose we are building an online shopping application.

### Traditional Approach (Waterfall)

```
Requirements
      ↓
Design
      ↓
Development
      ↓
Testing
      ↓
Deployment
```

The complete application is delivered at the end.


### Agile Approach

```
Sprint 1 → Login Feature
Sprint 2 → Product Feature
Sprint 3 → Payment Feature
Sprint 4 → Order Tracking
```

Users get working features regularly.


---

# 2. Agile Values - Agile Manifesto

The Agile Manifesto was introduced in 2001 by software developers to improve software development practices.


Agile Manifesto has **4 main values**:


## 1. Individuals and Interactions over Processes and Tools

Meaning:

People and communication are more important than just following tools and processes.


Example:

A team discussion is more valuable than depending only on documentation.


---

## 2. Working Software over Comprehensive Documentation

Meaning:

Delivering a working product is more important than creating large documents.


Example:

A working login feature is more valuable than a 100-page document.


---

## 3. Customer Collaboration over Contract Negotiation

Meaning:

Continuous communication with customers helps build better products.


---

## 4. Responding to Change over Following a Plan

Meaning:

Agile teams accept changes even during development.


Example:

If customer requirements change, the team adapts.


---

# 3. Agile Principles (12 Principles)


## 1. Customer Satisfaction

Deliver valuable software early and continuously.


## 2. Welcome Changes

Changes in requirements are accepted even late in development.


## 3. Frequent Delivery

Deliver working software frequently.


## 4. Collaboration

Business teams and developers work together.


## 5. Support and Trust Teams

Give teams resources and freedom.


## 6. Face-to-Face Communication

Direct communication improves understanding.


## 7. Working Software is the Main Measure

The product should work properly.


## 8. Sustainable Development

Maintain a consistent development pace.


## 9. Technical Excellence

Good design and coding practices improve quality.


## 10. Simplicity

Avoid unnecessary work.


## 11. Self-Organizing Teams

Teams decide the best way to complete tasks.


## 12. Continuous Improvement

Teams regularly improve their process.


---

# 4. Agile vs Waterfall


| Agile | Waterfall |
|---|---|
| Iterative development | Sequential development |
| Requirements can change | Requirements fixed initially |
| Frequent releases | Single final release |
| Customer feedback throughout | Feedback mostly at the end |
| Flexible approach | Less flexible |


### When to Use Agile?

Use Agile when:

- Requirements change frequently
- Customer feedback is important
- Product needs continuous improvement


### When to Use Waterfall?

Use Waterfall when:

- Requirements are clear
- Changes are unlikely
- Project follows strict regulations


---

# 5. Scrum Framework

## What is Scrum?

Scrum is one of the most popular Agile frameworks used to manage software development projects.

Scrum divides work into small cycles called **Sprints**.


A Sprint usually lasts:

```
1 to 4 weeks
```


Scrum Process:

```
Product Backlog
       ↓
Sprint Planning
       ↓
Sprint Development
       ↓
Daily Scrum
       ↓
Sprint Review
       ↓
Sprint Retrospective
```


---

# 6. Scrum Roles


## 1. Product Owner

The Product Owner represents the customer.

Responsibilities:

- Defines product requirements
- Manages Product Backlog
- Prioritizes features
- Communicates customer needs


Example:

Product Owner decides:

"Payment feature should be developed before profile customization."


---

## 2. Scrum Master

The Scrum Master helps the team follow Scrum practices.


Responsibilities:

- Conducts Scrum meetings
- Removes blockers
- Supports team members
- Ensures Agile practices are followed


---

## 3. Development Team

The development team builds the product.

Responsibilities:

- Design
- Coding
- Testing
- Delivering features


---

# 7. Scrum Ceremonies (Events)


## 1. Sprint Planning

Meeting where the team decides:

- What work will be done?
- How will it be completed?


Example:

```
Sprint Goal:
Implement User Login Feature
```


---

## 2. Daily Scrum

A short daily meeting (usually 15 minutes).


Each member answers:

1. What did I complete yesterday?
2. What will I do today?
3. Are there any blockers?


---

## 3. Sprint Review

Meeting at the end of the sprint.

Purpose:

- Demonstrate completed work
- Collect feedback from stakeholders


---

## 4. Sprint Retrospective

Team discusses:

- What went well?
- What problems occurred?
- How can we improve?


---

# 8. Scrum Artifacts


## 1. Product Backlog

A list of all features and requirements of a product.


Example:

```
Product Backlog

1. User Registration
2. Login
3. Payment
4. Order Tracking
```


Managed by:

Product Owner


---

## 2. Sprint Backlog

A list of tasks selected for the current sprint.


Example:

```
Sprint Backlog

Sprint 1:

✓ Create Login Page
✓ Create API
✓ Test Authentication
```


---

## 3. Increment

The final working product delivered after a sprint.


Example:

After Sprint 1:

```
Working Login Feature
```


---

## 4. Definition of Done (DoD)

A checklist that defines when a task is completed.


Example:

A feature is Done when:

 Code completed  
 Testing completed  
 Code reviewed  
 Documentation updated  


---

# 9. Agile Estimation and Planning Techniques


## Story Points

Story points are used to estimate the effort required to complete a user story.

They consider:

- Complexity
- Time
- Risk
- Effort


Example:

| Task | Story Points |
|---|---|
| Login Page | 3 |
| Payment Module | 8 |
| Complete E-commerce App | 21 |


Story points are not equal to hours.


---

# Planning Poker Technique

Planning Poker is a team-based estimation technique.


Process:

1. Product Owner explains requirement
2. Team members select estimation cards
3. Everyone reveals estimates
4. Discussion happens
5. Final estimate is decided


Example:

```
Developer 1 → 5 points
Developer 2 → 8 points
Developer 3 → 5 points

Final Estimate → 5 points
```


---

# Sprint Planning Process


Steps:

1. Select user stories
2. Estimate effort
3. Assign tasks
4. Define sprint goal


---

# Velocity

Velocity represents the amount of work a team completes in one sprint.


Example:

Sprint 1:

Completed:

```
20 Story Points
```


Team Velocity = 20


Used for future planning.


---

# Burndown Chart

A burndown chart shows remaining work during a sprint.


Example:

```
Remaining Work

100 |
80  |
60  |
40  |
20  |
0________________
    Sprint Days
```


It helps track sprint progress.


---

# 10. Agile User Stories


## What is a User Story?

A User Story describes a feature from the user's perspective.

It explains:

- Who needs the feature?
- What they need?
- Why they need it?


---

# User Story Format


```
As a [user]

I want [goal]

So that [benefit]
```


Example:

```
As a customer,
I want to add products to my cart,
so that I can purchase multiple items together.
```


---

# INVEST Principle

Good user stories follow INVEST:


## I - Independent

Story should not depend on another story.


## N - Negotiable

Details can be discussed.


## V - Valuable

Should provide value to users.


## E - Estimable

Team should estimate effort.


## S - Small

Should be completed within a sprint.


## T - Testable

Should have clear testing conditions.


---

# Acceptance Criteria


Acceptance Criteria defines conditions that must be satisfied for a user story to be completed.


Example:


User Story:

```
User should be able to login.
```


Acceptance Criteria:

```
Given user is on login page

When valid username and password are entered

Then user should successfully login.
```


This follows:

## Given - When - Then Format


### Given

Initial condition


### When

Action performed


### Then

Expected result


---

# Writing User Stories - Example


Feature:

Online Shopping Login


User Story:

```
As a customer,
I want to login into my account,
so that I can view my orders.
```


Acceptance Criteria:

```
Given user has registered account

When correct credentials are entered

Then user should access dashboard.
```


---

# 11. Agile Tools

Popular Agile project management tools:

| Tool | Purpose |
|---|---|
| Jira | Sprint and issue tracking |
| Trello | Task management |
| Azure Boards | Agile planning |
| Monday.com | Team collaboration |



