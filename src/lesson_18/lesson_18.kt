package lesson_18

import java.util.*

fun main() {

    // ad hoc (по случаю)
    // subtyping (полиморфизм включения)
    // parametric (параметрический)

    val creationDate = Date()
//    val note = NotesAppItem()

//    note.addItemToCell(
    val messageItem: NotesAppItem = MessageItem(
        "Call sister",
        creationDate,
        "Message",
        "Call sister to congratulate"
    )

//    note.addItemToCell(
    val phoneItem: NotesAppItem = PhoneItem(
        "Sister's number",
        creationDate,
        "Phone",
        89914424242,
    )

//    note.addItemToCell(
    val listItem: NotesAppItem = ListItem(
        "Todolist",
        creationDate,
        "List",
        listOf("Wash dog", "Do the cleaning", "Buy new shoes"),
    )

//    println(messageItem.getItemDate())
//    println()
//    println(phoneItem.getItemDate())
//    println()
//    println(listItem.getItemDate())

    val arrayOfNotes = arrayOf<NotesAppItem>(messageItem, phoneItem, listItem)
    showAllNotes(arrayOfNotes)

}

fun showAllNotes(notes: Array<NotesAppItem>) {
    notes.forEach {
        println(it.getItemDate())
    }
}