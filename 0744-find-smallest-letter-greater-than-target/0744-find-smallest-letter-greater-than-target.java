class Solution {
    public char binarysearch(char arr[],char target){
        int first = 0;
    int last = arr.length - 1;
    char ans = '$';//kabhi ans me nahni ayega to dollar sign lena pada
    while (first <= last) {
      int mid = first + (last - first) / 2;
     if (arr[mid]<=target) {
        first = mid + 1;
      } else {
        last = mid - 1;
        ans=arr[mid];
      }
    }
    if(ans=='$'){
       return arr[0];
    }else{
    return ans;
    }
    }
    public char nextGreatestLetter(char[] arr, char target) {
        char res= binarysearch(arr,target);
        return res;
    }
}