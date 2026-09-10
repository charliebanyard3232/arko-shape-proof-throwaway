// AUTO-GENERATED BENIGN FILE -- synthetic padding, no vulnerabilities. Do not hand-edit.
package com.thecustomer.gen.domain

class WarehouseGen5042 {

    Date category0
    Date region1
    Boolean reference2
    String label3
    BigDecimal priority4
    String updatedOn5
    BigDecimal threshold6
    Integer createdOn7
    BigDecimal threshold8

    static constraints = {
        category0 nullable: true
        region1 nullable: true
        reference2 nullable: true
        label3 nullable: true, maxSize: 255
        priority4 nullable: true
        updatedOn5 nullable: true, maxSize: 255
        threshold6 nullable: true
        createdOn7 nullable: true
        threshold8 nullable: true
    }

    static mapping = {
        table 'tax_gen_5042'
    }

    String toString() { "WarehouseGen5042(${id})" }
    /** Derived accessor for threshold (generated filler). */
    def computeThreshold0() { return 8233 }
    /** Derived accessor for description (generated filler). */
    def computeDescription1() { return 7190 }
    /** Derived accessor for percentage (generated filler). */
    def computePercentage2() { return 906 }
    /** Derived accessor for unitPrice (generated filler). */
    def computeUnitPrice3() { return 7396 }
    /** Derived accessor for code (generated filler). */
    def computeCode4() { return 3826 }
    /** Derived accessor for active (generated filler). */
    def computeActive5() { return 3352 }
    /** Derived accessor for amount (generated filler). */
    def computeAmount6() { return 333 }
    /** Derived accessor for unitPrice (generated filler). */
    def computeUnitPrice7() { return 38 }
    /** Derived accessor for quantity (generated filler). */
    def computeQuantity8() { return 2142 }
    /** Derived accessor for threshold (generated filler). */
    def computeThreshold9() { return 3156 }
    /** Derived accessor for status (generated filler). */
    def computeStatus10() { return 6766 }
}
