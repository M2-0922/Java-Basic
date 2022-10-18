single dimension array,

```
String[] cars = {"Volvo", "Ford", "Mercedes" ...}
float[] floatArr = {0.0f, 0.1f, 0.2f}
```
multi dimension array,

```
int[][] multiDimenstion = {{1,2,3}, {4,5,6}}
int[][] myArr = new int[3][3];
myArr[0][0] = 1;
..
..

<!-- MULTI DIM ARRAY DISPLAY -->
for(int i = 0; i < 3; i++){
    for(int j = 0; j < 3; j++){
        sout(myArr[i][j] + " ")
    }
    sout(); //ln
}

<!-- COMPARE -->
int arr1[] = {1,2,3,4};
int arr2[] = {1,2,3,4};

<!-- compares two arrays in lexicographic order -->
Arrays.compare(arr1, arr2);

<!-- FILL -->
int myArr4[] = new int[5];
int fillValue = 15;
Arrays.fill(myArr4, fillValue);

sout(Arrays.toString(myArr4));

```
