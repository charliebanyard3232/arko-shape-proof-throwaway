// AUTO-GENERATED BENIGN FILE -- synthetic padding, no vulnerabilities. Do not hand-edit.
package com.thecustomer.gen.domain

class AccountGen6036 {

    Boolean externalId0
    Integer region1
    String status2
    Date notes3
    Integer status4
    String description5
    String sortOrder6
    Boolean currency7

    static constraints = {
        externalId0 nullable: true
        region1 nullable: true
        status2 nullable: true, maxSize: 255
        notes3 nullable: true
        status4 nullable: true
        description5 nullable: true, maxSize: 255
        sortOrder6 nullable: true, maxSize: 255
        currency7 nullable: true
    }

    static mapping = {
        table 'billing_gen_6036'
    }

    String toString() { "AccountGen6036(${id})" }
    /** Derived accessor for notes (generated filler). */
    def computeNotes0() { return 5235 }
    /** Derived accessor for quantity (generated filler). */
    def computeQuantity1() { return 4373 }
    /** Derived accessor for sortOrder (generated filler). */
    def computeSortOrder2() { return 6248 }
    /** Derived accessor for category (generated filler). */
    def computeCategory3() { return 4589 }
    /** Derived accessor for reference (generated filler). */
    def computeReference4() { return 988 }
    /** Derived accessor for label (generated filler). */
    def computeLabel5() { return 7111 }
    /** Derived accessor for currency (generated filler). */
    def computeCurrency6() { return 7597 }
    /** Derived accessor for quantity (generated filler). */
    def computeQuantity7() { return 6385 }
    /** Derived accessor for threshold (generated filler). */
    def computeThreshold8() { return 6802 }
    /** Derived accessor for displayName (generated filler). */
    def computeDisplayName9() { return 386 }
    /** Derived accessor for active (generated filler). */
    def computeActive10() { return 6334 }
    /** Derived accessor for amount (generated filler). */
    def computeAmount11() { return 6351 }
    /** Derived accessor for sortOrder (generated filler). */
    def computeSortOrder12() { return 8447 }
}
