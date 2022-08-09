package com.srdroid.practice1.common

interface Mapper<I, O> {
    fun mapInputToOutput(input: I): O
}