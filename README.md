# Matrix-Multiplication-java-using-Threads-3-methods
This Program calculates the multiplication of 2 matrices in 3 methods using thread.<br/>
**First Method**<br/>
For every row in the result matrix one thread will calculate it.<br/>
This are the classes use by this method.<br/>
>Multiplier<br/>
>MultiplierTask<br/>
>ParallelRowMultiplier<br/>
>RowMultiplierTask<br/>
>MainExampleRow  (main)<br/>
<br/>

**Second Method**<br/>
For every number in the result matrix one thread will calculate it.<br/>
This are the classes use by this method.<br/>
>Multiplier<br/>
>MultiplierTask<br/>
>ParallelIndividualMultiplier<br/>
>IndividualMultiplierTask<br/>
>MainExampleIndividual  (main)<br/>
<br/>

**Third Method**<br/>
Specify a number for threads to be used and divide the rows of result matrix on the available threads,<br/>
to calculate the multiplication.<br/>
This are the classes use by this method.<br/>
>Multiplier<br/>
>MultiplierTask<br/>
>ParallelGroupMultiplier<br/>
>GroupMultiplierTask<br/>
>MainExampleGroup (main)<br/>
