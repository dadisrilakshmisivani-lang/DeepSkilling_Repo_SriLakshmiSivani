# Exercise 4 – Blog Application

## Objective

Develop a React application that fetches blog posts from an online REST API using the Fetch API and displays them using a class component.

---

## Components Created

- Post Model
- Posts (Class Component)

---

## Features

- Uses React Class Component.
- Fetches blog posts from JSONPlaceholder.
- Stores data in component state.
- Uses componentDidMount() lifecycle method.
- Displays blog title and body.
- Handles errors using componentDidCatch().

---

## API Used

https://jsonplaceholder.typicode.com/posts

---

## Project Structure

```
BlogApp/
│
├── Post.js
├── Posts.jsx
└── App4.jsx
```

---

## Technologies Used

- React
- JavaScript
- Fetch API
- Vite

---

## React Concepts Covered

- Class Components
- State
- Constructor
- Fetch API
- Lifecycle Methods
  - componentDidMount()
  - componentDidCatch()
- Rendering Lists using map()

---

## Steps Performed

1. Created the Post model.
2. Developed the Posts class component.
3. Initialized state with an empty posts array.
4. Implemented loadPosts() using Fetch API.
5. Loaded posts using componentDidMount().
6. Displayed the fetched posts using map().
7. Added error handling using componentDidCatch().
8. Rendered the Posts component through App4.

