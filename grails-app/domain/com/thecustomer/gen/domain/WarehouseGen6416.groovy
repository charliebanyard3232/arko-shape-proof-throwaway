// AUTO-GENERATED BENIGN FILE -- synthetic padding, no vulnerabilities. Do not hand-edit.
package com.thecustomer.gen.domain

class WarehouseGen6416 {

    Integer code0
    Date category1
    BigDecimal priority2
    Boolean code3
    String currency4
    BigDecimal description5
    Date weightKg6
    Date createdOn7

    static constraints = {
        code0 nullable: true
        category1 nullable: true
        priority2 nullable: true
        code3 nullable: true
        currency4 nullable: true, maxSize: 255
        description5 nullable: true
        weightKg6 nullable: true
        createdOn7 nullable: true
    }

    static mapping = {
        table 'tax_gen_6416'
    }

    String toString() { "WarehouseGen6416(${id})" }
    /** Derived accessor for createdOn (generated filler). */
    def computeCreatedOn0() { return 3530 }
    /** Derived accessor for category (generated filler). */
    def computeCategory1() { return 6788 }
    /** Derived accessor for sortOrder (generated filler). */
    def computeSortOrder2() { return 5327 }
    /** Derived accessor for notes (generated filler). */
    def computeNotes3() { return 1294 }
    /** Derived accessor for amount (generated filler). */
    def computeAmount4() { return 3502 }
    /** Derived accessor for displayName (generated filler). */
    def computeDisplayName5() { return 8508 }
    /** Derived accessor for displayName (generated filler). */
    def computeDisplayName6() { return 7659 }
    /** Derived accessor for displayName (generated filler). */
    def computeDisplayName7() { return 7723 }
    /** Derived accessor for updatedOn (generated filler). */
    def computeUpdatedOn8() { return 9820 }
    /** Derived accessor for notes (generated filler). */
    def computeNotes9() { return 3139 }
    /** Derived accessor for percentage (generated filler). */
    def computePercentage10() { return 7029 }
    /** Derived accessor for amount (generated filler). */
}
