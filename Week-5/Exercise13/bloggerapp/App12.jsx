import React, { useState } from "react";
import BookDetails from "./BookDetails";
import BlogDetails from "./BlogDetails";
import CourseDetails from "./CourseDetails";


function App(){

  const [page,setPage] = useState("book");


  // Switch Case Conditional Rendering
  function displayPage(){

    switch(page){

      case "book":
        return <BookDetails />;

      case "blog":
        return <BlogDetails />;

      case "course":
        return <CourseDetails />;

      default:
        return <h2>No Page Selected</h2>;

    }

  }



  return(

    <div>

      <h1>Blogger App</h1>


      <button onClick={()=>setPage("book")}>
        Book Details
      </button>


      <button onClick={()=>setPage("blog")}>
        Blog Details
      </button>


      <button onClick={()=>setPage("course")}>
        Course Details
      </button>


      <hr/>


      {
        // Conditional Rendering using function
        displayPage()
      }



      {
        // Logical AND Conditional Rendering
        page==="blog" && 
        <p>
          Welcome to Blog Section
        </p>
      }


    </div>

  );

}


export default App;