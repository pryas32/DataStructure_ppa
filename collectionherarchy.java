public class collectionherarchy {
    collection is the interface which is the root of all the classes and interfaces in java
    collections-> it is a class which is used for implementation of various algorithm eg sort(), min(), max(), reverse(), binary_search() ,fill()


   List->ArrayList(dynamic size array),linkedlist(doubly linkedlist),stack(use arraylis in single threade env), vector(use arraydequeue)
   set->it contains keys hashset(use hashmap ,unordered),treeset(sorted use red black tree), linkedhashset(order of insertion ,use linkedHashMap)                         
 queue->Arraydeque,linkedlist,prirityqueu
 dequeue->Arraydequeue, linkedlist
 map->hashmap,treemap,linkedHashMap


                          Iterable(foreach,lterator)
                                |
                                collection
                                   |
                    |                 |                |               |
                 List                Set             Queue           Dequeue
                 |                    |                 |                |
                 ArrayList          Hashset           PriorityQueeue    ArrayDequeeu
                 linkedlist          TreeSet          linkedlist          linkedlist  
                 Stack               linkedhashset     ArrayDequeeu
                 vector(arrayDequeue)



     Map
     |
     hashmap,treemap,linkedHashMap

}
   we can have these data structure of non primitive type
   we can have these non primitive by importing import java.util.*;