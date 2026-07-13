import React from "react";


function BlogDetails(){


let loggedIn=true;


return(

<div>

<h2>Blog Details</h2>


<h3>
React Conditional Rendering
</h3>


<p>
Author: Sivani
</p>


{

// If Else Conditional Rendering

loggedIn ?

<p>
You can read the full blog
</p>

:

<p>
Please Login to read blog
</p>

}


</div>

);


}


export default BlogDetails;