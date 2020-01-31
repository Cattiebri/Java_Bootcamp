package jtm.activity09;


/*- TODO #2
 * Implement Iterator interface with Orders class
 * Hint! Use generic type argument of iterateable items in form: Iterator<Order>
 *
 * TODO #3 Override/implement public methods for Orders class:
 * - Orders()                — create new empty Orders
 * - add(Order item)            — add passed order to the Orders
 * - List<Order> getItemsList() — List of all customer orders
 * - Set<Order> getItemsSet()   — calculated Set of Orders from list (look at description below)
 * - sort()                     — sort list of orders according to the sorting rules
 * - boolean hasNext()          — check is there next Order in Orders
 * - Order next()               — get next Order from Orders, throw NoSuchElementException if can't
 * - remove()                   — remove current Order (order got by previous next()) from list, throw IllegalStateException if can't
 * - String toString()          — show list of Orders as a String
 *
 * Hints:
 * 1. To convert Orders to String, reuse .toString() method of List.toString()
 * 2. Use built in List.sort() method to sort list of orders
 *
 * TODO #4
 * When implementing getItemsSet() method, join all requests for the same item from different customers
 * in following way: if there are two requests:
 *  - ItemN: Customer1: 3
 *  - ItemN: Customer2: 1
 *  Set of orders should be:
 *  - ItemN: Customer1,Customer2: 4
 */

import java.util.*;
import java.util.function.Consumer;

public class Orders implements Iterator<Order> {
    /*-
     * TODO #1
     * Create data structure to hold:
     *   1. some kind of collection of Orders (e.g. some List)
     *   2. index to the current order for iterations through the Orders in Orders
     *   Hints:
     *   1. you can use your own implementation or rely on .iterator() of the List
     *   2. when constructing list of orders, set number of current order to -1
     *      (which is usual approach when working with iterateable collections).
     */
    public List<Order> allOrders;
    public ListIterator<Order> myIterator;

    public Orders() {
        this.allOrders = new LinkedList<>();
        this.myIterator = allOrders.listIterator();
    }

    public void add(Order item) {
        this.myIterator.add(item);
        this.myIterator.previous();
    }

    public List<Order> getItemsList() {
        return new LinkedList<>(allOrders);
    }

    public Set<Order> getItemsSet() {
        return new HashSet<>(allOrders);
    }

    public void sort() {
        Collections.sort(allOrders);
    }

    @Override
    public String toString() {
        return allOrders.toString();
    }

    @Override
    public boolean hasNext() {
        return myIterator.hasNext();
    }

    @Override
    public Order next() {
       return myIterator.next();
    }

    @Override
    public void remove() {
       myIterator.remove();
    }
}
