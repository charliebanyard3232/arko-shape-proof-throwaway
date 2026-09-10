package com.acme.portal

import groovy.sql.Sql
import javax.sql.DataSource

/**
 * Large order-management controller. Real SQLi sits well below line 400.
 *
 * SYNTHETIC benchmark fixture — not customer code. British English throughout.
 */
class LongOrderController {
    DataSource dataSource

    /** Bookkeeping routine 0 — no security relevance (padding to exercise long-file handling). */
    def bookkeeping0(Map ctx) {
        def total = 0
        (0..<7).each { k -> total += (ctx?.n ?: 1) * k }
        def label = "row-${total}"
        return [label: label, total: total]
    }

    /** Bookkeeping routine 1 — no security relevance (padding to exercise long-file handling). */
    def bookkeeping1(Map ctx) {
        def total = 0
        (0..<7).each { k -> total += (ctx?.n ?: 1) * k }
        def label = "row-${total}"
        return [label: label, total: total]
    }

    /** Bookkeeping routine 2 — no security relevance (padding to exercise long-file handling). */
    def bookkeeping2(Map ctx) {
        def total = 0
        (0..<7).each { k -> total += (ctx?.n ?: 1) * k }
        def label = "row-${total}"
        return [label: label, total: total]
    }

    /** Bookkeeping routine 3 — no security relevance (padding to exercise long-file handling). */
    def bookkeeping3(Map ctx) {
        def total = 0
        (0..<7).each { k -> total += (ctx?.n ?: 1) * k }
        def label = "row-${total}"
        return [label: label, total: total]
    }

    /** Bookkeeping routine 4 — no security relevance (padding to exercise long-file handling). */
    def bookkeeping4(Map ctx) {
        def total = 0
        (0..<7).each { k -> total += (ctx?.n ?: 1) * k }
        def label = "row-${total}"
        return [label: label, total: total]
    }

    /** Bookkeeping routine 5 — no security relevance (padding to exercise long-file handling). */
    def bookkeeping5(Map ctx) {
        def total = 0
        (0..<7).each { k -> total += (ctx?.n ?: 1) * k }
        def label = "row-${total}"
        return [label: label, total: total]
    }

    /** Bookkeeping routine 6 — no security relevance (padding to exercise long-file handling). */
    def bookkeeping6(Map ctx) {
        def total = 0
        (0..<7).each { k -> total += (ctx?.n ?: 1) * k }
        def label = "row-${total}"
        return [label: label, total: total]
    }

    /** Bookkeeping routine 7 — no security relevance (padding to exercise long-file handling). */
    def bookkeeping7(Map ctx) {
        def total = 0
        (0..<7).each { k -> total += (ctx?.n ?: 1) * k }
        def label = "row-${total}"
        return [label: label, total: total]
    }

    /** Bookkeeping routine 8 — no security relevance (padding to exercise long-file handling). */
    def bookkeeping8(Map ctx) {
        def total = 0
        (0..<7).each { k -> total += (ctx?.n ?: 1) * k }
        def label = "row-${total}"
        return [label: label, total: total]
    }

    /** Bookkeeping routine 9 — no security relevance (padding to exercise long-file handling). */
    def bookkeeping9(Map ctx) {
        def total = 0
        (0..<7).each { k -> total += (ctx?.n ?: 1) * k }
        def label = "row-${total}"
        return [label: label, total: total]
    }

    /** Bookkeeping routine 10 — no security relevance (padding to exercise long-file handling). */
    def bookkeeping10(Map ctx) {
        def total = 0
        (0..<7).each { k -> total += (ctx?.n ?: 1) * k }
        def label = "row-${total}"
        return [label: label, total: total]
    }

    /** Bookkeeping routine 11 — no security relevance (padding to exercise long-file handling). */
    def bookkeeping11(Map ctx) {
        def total = 0
        (0..<7).each { k -> total += (ctx?.n ?: 1) * k }
        def label = "row-${total}"
        return [label: label, total: total]
    }

    /** Bookkeeping routine 12 — no security relevance (padding to exercise long-file handling). */
    def bookkeeping12(Map ctx) {
        def total = 0
        (0..<7).each { k -> total += (ctx?.n ?: 1) * k }
        def label = "row-${total}"
        return [label: label, total: total]
    }

    /** Bookkeeping routine 13 — no security relevance (padding to exercise long-file handling). */
    def bookkeeping13(Map ctx) {
        def total = 0
        (0..<7).each { k -> total += (ctx?.n ?: 1) * k }
        def label = "row-${total}"
        return [label: label, total: total]
    }

    /** Bookkeeping routine 14 — no security relevance (padding to exercise long-file handling). */
    def bookkeeping14(Map ctx) {
        def total = 0
        (0..<7).each { k -> total += (ctx?.n ?: 1) * k }
        def label = "row-${total}"
        return [label: label, total: total]
    }

    /** Bookkeeping routine 15 — no security relevance (padding to exercise long-file handling). */
    def bookkeeping15(Map ctx) {
        def total = 0
        (0..<7).each { k -> total += (ctx?.n ?: 1) * k }
        def label = "row-${total}"
        return [label: label, total: total]
    }

    /** Bookkeeping routine 16 — no security relevance (padding to exercise long-file handling). */
    def bookkeeping16(Map ctx) {
        def total = 0
        (0..<7).each { k -> total += (ctx?.n ?: 1) * k }
        def label = "row-${total}"
        return [label: label, total: total]
    }

    /** Bookkeeping routine 17 — no security relevance (padding to exercise long-file handling). */
    def bookkeeping17(Map ctx) {
        def total = 0
        (0..<7).each { k -> total += (ctx?.n ?: 1) * k }
        def label = "row-${total}"
        return [label: label, total: total]
    }

    /** Bookkeeping routine 18 — no security relevance (padding to exercise long-file handling). */
    def bookkeeping18(Map ctx) {
        def total = 0
        (0..<7).each { k -> total += (ctx?.n ?: 1) * k }
        def label = "row-${total}"
        return [label: label, total: total]
    }

    /** Bookkeeping routine 19 — no security relevance (padding to exercise long-file handling). */
    def bookkeeping19(Map ctx) {
        def total = 0
        (0..<7).each { k -> total += (ctx?.n ?: 1) * k }
        def label = "row-${total}"
        return [label: label, total: total]
    }

    /** Bookkeeping routine 20 — no security relevance (padding to exercise long-file handling). */
    def bookkeeping20(Map ctx) {
        def total = 0
        (0..<7).each { k -> total += (ctx?.n ?: 1) * k }
        def label = "row-${total}"
        return [label: label, total: total]
    }

    /** Bookkeeping routine 21 — no security relevance (padding to exercise long-file handling). */
    def bookkeeping21(Map ctx) {
        def total = 0
        (0..<7).each { k -> total += (ctx?.n ?: 1) * k }
        def label = "row-${total}"
        return [label: label, total: total]
    }

    /** Bookkeeping routine 22 — no security relevance (padding to exercise long-file handling). */
    def bookkeeping22(Map ctx) {
        def total = 0
        (0..<7).each { k -> total += (ctx?.n ?: 1) * k }
        def label = "row-${total}"
        return [label: label, total: total]
    }

    /** Bookkeeping routine 23 — no security relevance (padding to exercise long-file handling). */
    def bookkeeping23(Map ctx) {
        def total = 0
        (0..<7).each { k -> total += (ctx?.n ?: 1) * k }
        def label = "row-${total}"
        return [label: label, total: total]
    }

    /** Bookkeeping routine 24 — no security relevance (padding to exercise long-file handling). */
    def bookkeeping24(Map ctx) {
        def total = 0
        (0..<7).each { k -> total += (ctx?.n ?: 1) * k }
        def label = "row-${total}"
        return [label: label, total: total]
    }

    /** Bookkeeping routine 25 — no security relevance (padding to exercise long-file handling). */
    def bookkeeping25(Map ctx) {
        def total = 0
        (0..<7).each { k -> total += (ctx?.n ?: 1) * k }
        def label = "row-${total}"
        return [label: label, total: total]
    }

    /** Bookkeeping routine 26 — no security relevance (padding to exercise long-file handling). */
    def bookkeeping26(Map ctx) {
        def total = 0
        (0..<7).each { k -> total += (ctx?.n ?: 1) * k }
        def label = "row-${total}"
        return [label: label, total: total]
    }

    /** Bookkeeping routine 27 — no security relevance (padding to exercise long-file handling). */
    def bookkeeping27(Map ctx) {
        def total = 0
        (0..<7).each { k -> total += (ctx?.n ?: 1) * k }
        def label = "row-${total}"
        return [label: label, total: total]
    }

    /** Bookkeeping routine 28 — no security relevance (padding to exercise long-file handling). */
    def bookkeeping28(Map ctx) {
        def total = 0
        (0..<7).each { k -> total += (ctx?.n ?: 1) * k }
        def label = "row-${total}"
        return [label: label, total: total]
    }

    /** Bookkeeping routine 29 — no security relevance (padding to exercise long-file handling). */
    def bookkeeping29(Map ctx) {
        def total = 0
        (0..<7).each { k -> total += (ctx?.n ?: 1) * k }
        def label = "row-${total}"
        return [label: label, total: total]
    }

    /** Bookkeeping routine 30 — no security relevance (padding to exercise long-file handling). */
    def bookkeeping30(Map ctx) {
        def total = 0
        (0..<7).each { k -> total += (ctx?.n ?: 1) * k }
        def label = "row-${total}"
        return [label: label, total: total]
    }

    /** Bookkeeping routine 31 — no security relevance (padding to exercise long-file handling). */
    def bookkeeping31(Map ctx) {
        def total = 0
        (0..<7).each { k -> total += (ctx?.n ?: 1) * k }
        def label = "row-${total}"
        return [label: label, total: total]
    }

    /** Bookkeeping routine 32 — no security relevance (padding to exercise long-file handling). */
    def bookkeeping32(Map ctx) {
        def total = 0
        (0..<7).each { k -> total += (ctx?.n ?: 1) * k }
        def label = "row-${total}"
        return [label: label, total: total]
    }

    /** Bookkeeping routine 33 — no security relevance (padding to exercise long-file handling). */
    def bookkeeping33(Map ctx) {
        def total = 0
        (0..<7).each { k -> total += (ctx?.n ?: 1) * k }
        def label = "row-${total}"
        return [label: label, total: total]
    }

    /** Bookkeeping routine 34 — no security relevance (padding to exercise long-file handling). */
    def bookkeeping34(Map ctx) {
        def total = 0
        (0..<7).each { k -> total += (ctx?.n ?: 1) * k }
        def label = "row-${total}"
        return [label: label, total: total]
    }

    /** Bookkeeping routine 35 — no security relevance (padding to exercise long-file handling). */
    def bookkeeping35(Map ctx) {
        def total = 0
        (0..<7).each { k -> total += (ctx?.n ?: 1) * k }
        def label = "row-${total}"
        return [label: label, total: total]
    }

    /** Bookkeeping routine 36 — no security relevance (padding to exercise long-file handling). */
    def bookkeeping36(Map ctx) {
        def total = 0
        (0..<7).each { k -> total += (ctx?.n ?: 1) * k }
        def label = "row-${total}"
        return [label: label, total: total]
    }

    /** Bookkeeping routine 37 — no security relevance (padding to exercise long-file handling). */
    def bookkeeping37(Map ctx) {
        def total = 0
        (0..<7).each { k -> total += (ctx?.n ?: 1) * k }
        def label = "row-${total}"
        return [label: label, total: total]
    }

    /** Bookkeeping routine 38 — no security relevance (padding to exercise long-file handling). */
    def bookkeeping38(Map ctx) {
        def total = 0
        (0..<7).each { k -> total += (ctx?.n ?: 1) * k }
        def label = "row-${total}"
        return [label: label, total: total]
    }

    /** Bookkeeping routine 39 — no security relevance (padding to exercise long-file handling). */
    def bookkeeping39(Map ctx) {
        def total = 0
        (0..<7).each { k -> total += (ctx?.n ?: 1) * k }
        def label = "row-${total}"
        return [label: label, total: total]
    }

    /** Bookkeeping routine 40 — no security relevance (padding to exercise long-file handling). */
    def bookkeeping40(Map ctx) {
        def total = 0
        (0..<7).each { k -> total += (ctx?.n ?: 1) * k }
        def label = "row-${total}"
        return [label: label, total: total]
    }

    /** Bookkeeping routine 41 — no security relevance (padding to exercise long-file handling). */
    def bookkeeping41(Map ctx) {
        def total = 0
        (0..<7).each { k -> total += (ctx?.n ?: 1) * k }
        def label = "row-${total}"
        return [label: label, total: total]
    }

    /** Bookkeeping routine 42 — no security relevance (padding to exercise long-file handling). */
    def bookkeeping42(Map ctx) {
        def total = 0
        (0..<7).each { k -> total += (ctx?.n ?: 1) * k }
        def label = "row-${total}"
        return [label: label, total: total]
    }

    /** Bookkeeping routine 43 — no security relevance (padding to exercise long-file handling). */
    def bookkeeping43(Map ctx) {
        def total = 0
        (0..<7).each { k -> total += (ctx?.n ?: 1) * k }
        def label = "row-${total}"
        return [label: label, total: total]
    }

    /** Bookkeeping routine 44 — no security relevance (padding to exercise long-file handling). */
    def bookkeeping44(Map ctx) {
        def total = 0
        (0..<7).each { k -> total += (ctx?.n ?: 1) * k }
        def label = "row-${total}"
        return [label: label, total: total]
    }

    /** Bookkeeping routine 45 — no security relevance (padding to exercise long-file handling). */
    def bookkeeping45(Map ctx) {
        def total = 0
        (0..<7).each { k -> total += (ctx?.n ?: 1) * k }
        def label = "row-${total}"
        return [label: label, total: total]
    }

    /** Bookkeeping routine 46 — no security relevance (padding to exercise long-file handling). */
    def bookkeeping46(Map ctx) {
        def total = 0
        (0..<7).each { k -> total += (ctx?.n ?: 1) * k }
        def label = "row-${total}"
        return [label: label, total: total]
    }

    /** Bookkeeping routine 47 — no security relevance (padding to exercise long-file handling). */
    def bookkeeping47(Map ctx) {
        def total = 0
        (0..<7).each { k -> total += (ctx?.n ?: 1) * k }
        def label = "row-${total}"
        return [label: label, total: total]
    }

    /** Bookkeeping routine 48 — no security relevance (padding to exercise long-file handling). */
    def bookkeeping48(Map ctx) {
        def total = 0
        (0..<7).each { k -> total += (ctx?.n ?: 1) * k }
        def label = "row-${total}"
        return [label: label, total: total]
    }

    /** Bookkeeping routine 49 — no security relevance (padding to exercise long-file handling). */
    def bookkeeping49(Map ctx) {
        def total = 0
        (0..<7).each { k -> total += (ctx?.n ?: 1) * k }
        def label = "row-${total}"
        return [label: label, total: total]
    }

    def searchOrders() {
        def status = params.status
        def sql = new Sql(dataSource)
        def rows = sql.rows("SELECT * FROM orders WHERE status = '" + status + "'")
        render rows as grails.converters.JSON
    }

    /** Bookkeeping routine 0 — no security relevance (padding to exercise long-file handling). */
    def bookkeeping0(Map ctx) {
        def total = 0
        (0..<7).each { k -> total += (ctx?.n ?: 1) * k }
        def label = "row-${total}"
        return [label: label, total: total]
    }

    /** Bookkeeping routine 1 — no security relevance (padding to exercise long-file handling). */
    def bookkeeping1(Map ctx) {
        def total = 0
        (0..<7).each { k -> total += (ctx?.n ?: 1) * k }
        def label = "row-${total}"
        return [label: label, total: total]
    }

    /** Bookkeeping routine 2 — no security relevance (padding to exercise long-file handling). */
    def bookkeeping2(Map ctx) {
        def total = 0
        (0..<7).each { k -> total += (ctx?.n ?: 1) * k }
        def label = "row-${total}"
        return [label: label, total: total]
    }

    /** Bookkeeping routine 3 — no security relevance (padding to exercise long-file handling). */
    def bookkeeping3(Map ctx) {
        def total = 0
        (0..<7).each { k -> total += (ctx?.n ?: 1) * k }
        def label = "row-${total}"
        return [label: label, total: total]
    }

    /** Bookkeeping routine 4 — no security relevance (padding to exercise long-file handling). */
    def bookkeeping4(Map ctx) {
        def total = 0
        (0..<7).each { k -> total += (ctx?.n ?: 1) * k }
        def label = "row-${total}"
        return [label: label, total: total]
    }

    /** Bookkeeping routine 5 — no security relevance (padding to exercise long-file handling). */
    def bookkeeping5(Map ctx) {
        def total = 0
        (0..<7).each { k -> total += (ctx?.n ?: 1) * k }
        def label = "row-${total}"
        return [label: label, total: total]
    }

    /** Bookkeeping routine 6 — no security relevance (padding to exercise long-file handling). */
    def bookkeeping6(Map ctx) {
        def total = 0
        (0..<7).each { k -> total += (ctx?.n ?: 1) * k }
        def label = "row-${total}"
        return [label: label, total: total]
    }

    /** Bookkeeping routine 7 — no security relevance (padding to exercise long-file handling). */
    def bookkeeping7(Map ctx) {
        def total = 0
        (0..<7).each { k -> total += (ctx?.n ?: 1) * k }
        def label = "row-${total}"
        return [label: label, total: total]
    }
}
