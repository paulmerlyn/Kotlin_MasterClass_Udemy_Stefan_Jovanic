package tictactoe

import kotlin.random.Random

fun main () {
    var winner: String? = null
    var board = mutableMapOf(0 to '_', 1 to '_', 2 to '_', 3 to '_', 4 to '_', 5 to '_', 6 to '_', 7 to '_', 8 to '_')
    getPlayerName()
    initializeBoard(board)
    while (winner == null) {
        playRound(board)
        printBoard(board)
        winner = whoIsWinner(board)
    }
    println("The winner is $winner")}

fun playRound(board: MutableMap<Int, Char>): Unit {
    var move = obtainMove()
    updateBoardWithMove(board, move, 'X')
    move = obtainComputerMove(board)
    updateBoardWithMove(board, move, 'O')
    // return board
}

fun getPlayerName(): String {
    print("Enter your name: ")
    return readLine() ?: "Player"
}

fun initializeBoard(board: MutableMap<Int, Char>) {
    printBoard(board)
}

fun printBoard(board: Map<Int, Char>) {
    var count = 0
    for (row in 0..2) {
        for (cell in 0..2) {
            print(board[count])
            count++
        }
        println()
    }
}

fun obtainMove(): Int {
    print("Enter your move (0-8): ")
    val moveInt = readlnOrNull()
    if (moveInt == null) {
        println("Invalid input. Please enter a number between 0 and 8.")
        return obtainMove()
    } else {
        return moveInt.toInt()
    }
}

fun updateBoardWithMove(board: MutableMap<Int, Char>, move: Int, player: Char): Unit {
    board[move] = player
    //return board
}

fun obtainComputerMove(board: MutableMap<Int, Char>): Int {
    var rand = Random.nextInt(0, 9)
    if (board[rand] == '_') {
        return rand
    } else {
        return obtainComputerMove(board)
    }
}

fun whoIsWinner(board: Map<Int, Char>): String? {
    if (board[0] == board[1] && board[1] == board[2] && board[0] != '_') {
        return board[0].toString()
    } else if (board[3] == board[4] && board[4] == board[5] && board[3] != '_') {
        return board[3].toString()
    } else if (board[6] == board[7] && board[7] == board[8] && board[6] != '_') {
        return board[6].toString()
    } else if (board[0] == board[3] && board[3] == board[6] && board[0] != '_') {
        return board[0].toString()
    } else if (board[1] == board[4] && board[4] == board[7] && board[1] != '_') {
        return board[1].toString()
    } else if (board[2] == board[5] && board[5] == board[8] && board[2] != '_') {
        return board[2].toString()
    } else if (board[0] == board[4] && board[4] == board[8] && board[0] != '_') {
        return board[0].toString()
    } else if (board[2] == board[4] && board[4] == board[6] && board[2] != '_') {
        return board[2].toString()
    }
    return null
}