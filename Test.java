void BubbleSort(int data,int listSize)
{  int pass, tempValue};
   for ( pass =1;pass<listSize; pass++)
   {
    // moves the largest element to the
    // end of the array
        for (int x = 0; x < listSize - pass; x++)
            //compare adjacent elements
            if ( data[x]>data[x+1[])
               { //swap elements
                   tempValue = data[x];
                data[x] = data[x+1];
                data[x+1] = tempValue;
               }
    }

}// end Bubble Sort