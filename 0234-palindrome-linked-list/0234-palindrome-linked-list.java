/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public boolean isPalindrome(ListNode head) {
        ListNode temp=new ListNode();
        temp=head;
        int n=1;
        while(temp.next != null){
            n++;
            temp=temp.next;
        }
        temp=head;
        int[] arr=new int[n];
        for(int i= arr.length-1;i>=0;i--){
            arr[i]=temp.val;
            temp=temp.next;
        }
        temp=head;
        for(int i=0;i<arr.length;i++){
            if(arr[i] != temp.val){
                return false;
            }
            temp=temp.next;
        }
        return true;
    }
}