# Ejercicios - Problemas de aplicacion con listas enlazadas simples

> [!Important]
> Este codigo es tomado del siguiente [link](https://github.com/katychuang/cisc3130/tree/master/class_examples/linkedlist)


## Film Collection

Intente insertar y eliminar películas de la colección de películas.

**Codigo de inicio**: [FilmCollectionExample.java](FilmCollectionExample.java)

```java
public static void main(String[] args) {
    FilmCollection watchList = new FilmCollection();
    watchList.insertFirst("The Matrix", 1999);
    watchList.insertFirst("The Matrix Revolutions", 2003);
    watchList.insertFirst("The Matrix Reloaded", 2003);
    watchList.insertFirst("Iron Man", 2008);
    watchList.displayList();

    watchList.deleteFirst();
    watchList.displayList()’
}
```

## Song Playlist 

Implemente el código que permitiría que este fragmento funcione:

**Codigo de inicio**: [PlayListExample.java](PlayListExample.java)

```java
public static void main(String[] args) {
    Playlist playlist = new Playlist();
    playlist.insertFirst("WAP", 5992721);
    playlist.insertFirst("Mood",5342940);
    playlist.insertFirst("Hawái", 5082385);
    playlist.insertFirst("Dynamite",4081950);
    playlist.displayList();
}
```
--- 

## Simple Linked List

### Inserting, deleting, and searching from a simple linked list

Intente implementar el código que le permitiría hacer lo siguiente:

**Codigo de inicio**: [LinkedListTest.java](LinkedListTest.java)

```java
LinkedList myList = new LinkedList();
myList.insertFirst(22);
myList.insertFirst(44);
myList.insertFirst(66);
myList.insertFirst(88);

myList.displayList();

while (!myList.isEmpty())
   myList.deleteFirst();

myList.displayList();
```

