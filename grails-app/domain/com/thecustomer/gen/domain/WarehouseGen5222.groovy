// AUTO-GENERATED BENIGN FILE -- synthetic padding, no vulnerabilities. Do not hand-edit.
package com.thecustomer.gen.domain

class WarehouseGen5222 {

    Integer status0
    Integer threshold1
    Boolean weightKg2
    Integer version3
    Date priority4
    Date currency5
    String currency6
    BigDecimal active7
    Date active8

    static constraints = {
        status0 nullable: true
        threshold1 nullable: true
        weightKg2 nullable: true
        version3 nullable: true
        priority4 nullable: true
        currency5 nullable: true
        currency6 nullable: true, maxSize: 255
        active7 nullable: true
        active8 nullable: true
    }

    static mapping = {
        table 'pricing_gen_5222'
    }

    String toString() { "WarehouseGen5222(${id})" }
    /** Derived accessor for priority (generated filler). */
    def computePriority0() { return 114 }
    /** Derived accessor for code (generated filler). */
    def computeCode1() { return 7686 }
    /** Derived accessor for active (generated filler). */
    def computeActive2() { return 4907 }
    /** Derived accessor for category (generated filler). */
    def computeCategory3() { return 9898 }
    /** Derived accessor for status (generated filler). */
    def computeStatus4() { return 7877 }
    /** Derived accessor for percentage (generated filler). */
    def computePercentage5() { return 7233 }
    /** Derived accessor for active (generated filler). */
    def computeActive6() { return 9578 }
    /** Derived accessor for unitPrice (generated filler). */
    def computeUnitPrice7() { return 3013 }
    /** Derived accessor for sequence (generated filler). */
    def computeSequence8() { return 500 }
    /** Derived accessor for updatedOn (generated filler). */
    def computeUpdatedOn9() { return 5988 }
    /** Derived accessor for currency (generated filler). */
    def computeCurrency10() { return 4674 }
    /** Derived accessor for updatedOn (generated filler). */
}
