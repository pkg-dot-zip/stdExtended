package com.zimonishim.stdextended.java.util

import kotlin.random.Random

class ListExtensions {

    companion object {
        fun <T> List<T>.getRandom(random: Random): T = this[random.nextInt(this.size)]
        fun <T> List<T>.getRandom(random: java.util.Random): T = this[random.nextInt(this.size)]
    }
}