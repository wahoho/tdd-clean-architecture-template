package com.wahoho.batch

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

fun main(args: Array<String>) {
    runApplication<BatchApplication>(*args)
}

@SpringBootApplication(scanBasePackages = ["com.wahoho"])
class BatchApplication

