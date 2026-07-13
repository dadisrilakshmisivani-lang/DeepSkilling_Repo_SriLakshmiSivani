import React from "react";


function CourseDetails(){


let enrolled=false;


let message;


if(enrolled){

    message="You are enrolled in React Course";

}

else{

    message="Please enroll to access the course";

}



return(

<div>

<h2>Course Details</h2>


<h3>
React JS Course
</h3>


<p>
Duration: 8 Weeks
</p>


<p>
{
    message
}
</p>


</div>

);


}


export default CourseDetails;