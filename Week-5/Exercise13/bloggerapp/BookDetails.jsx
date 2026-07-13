import React from "react";


function BookDetails(){


const available=true;


return(

<div>

<h2>Book Details</h2>


<h3>
Title: React Learning
</h3>

<p>
Author: John Smith
</p>

<p>
Price: ₹500
</p>


{
    // Ternary Operator Conditional Rendering
    available ?

    <p>
        Book is Available
    </p>

    :

    <p>
        Book is Out of Stock
    </p>
}


</div>

);

}


export default BookDetails;