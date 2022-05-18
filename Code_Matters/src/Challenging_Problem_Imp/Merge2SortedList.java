package Challenging_Problem_Imp;

import java.util.LinkedList;

public class Merge2SortedList {
    /*You are given the heads of two sorted linked lists list1 and list2.

Merge the two lists in a one sorted list. The list should be made by splicing together the nodes of the first two lists.

Return the head of the merged linked list.

Input: list1 = [1,2,4], list2 = [1,3,4]
Output: [1,1,2,3,4,4]
*/
    public static void main(String[] args) {
    // so after merging 2 linked list, make sure they remain sorted

        LinkedList<Integer> l1 = new LinkedList<>();
        l1.add(1);
        l1.add(2);
        l1.add(4);

        LinkedList<Integer> l2 = new LinkedList<>();
        l2.add(1);
        l2.add(2);
        l2.add(3);
        l2.add(4);

        // coult not solve
/*
*        ListNode temp_node = new ListNode(0);
        ListNode current_node = temp_node;

        while(l1 != null && l2 != null){

            if(l1.val < l2.val){
                current_node.next = l1;
                l1 = l1.next;
            }else{
                current_node.next = l2;
                l2 = l2.next;
            }
            current_node = current_node.next;
        }
        if(l1 != null){
            current_node.next = l1;
            l1 = l1.next;
        }
        if(l2 != null){
            current_node.next = l2;
            l2= l2.next;
        }
        return temp_node.next;*/

    }

}
