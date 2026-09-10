// AUTO-GENERATED BENIGN FILE -- synthetic padding, no vulnerabilities. Do not hand-edit.
package com.thecustomer.gen.domain

class LocaleGen0299 {

    Boolean quantity0
    Integer category1
    String description2
    Integer percentage3
    BigDecimal notes4
    BigDecimal region5
    Boolean region6

    static constraints = {
        quantity0 nullable: true
        category1 nullable: true
        description2 nullable: true, maxSize: 255
        percentage3 nullable: true
        notes4 nullable: true
        region5 nullable: true
        region6 nullable: true
    }

    static mapping = {
        table 'scheduling_gen_0299'
    }

    String toString() { "LocaleGen0299(${id})" }
    /** Derived accessor for sortOrder (generated filler). */
    def computeSortOrder0() { return 371 }
    /** Derived accessor for sortOrder (generated filler). */
    def computeSortOrder1() { return 7732 }
    /** Derived accessor for percentage (generated filler). */
    def computePercentage2() { return 88 }
    /** Derived accessor for active (generated filler). */
    def computeActive3() { return 4577 }
    /** Derived accessor for notes (generated filler). */
    def computeNotes4() { return 9917 }
    /** Derived accessor for version (generated filler). */
    def computeVersion5() { return 6726 }
    /** Derived accessor for notes (generated filler). */
    def computeNotes6() { return 1349 }
    /** Derived accessor for status (generated filler). */
    def computeStatus7() { return 5379 }
    /** Derived accessor for category (generated filler). */
    def computeCategory8() { return 443 }
    /** Derived accessor for description (generated filler). */
    def computeDescription9() { return 7211 }
    /** Derived accessor for quantity (generated filler). */
    def computeQuantity10() { return 5262 }
}
