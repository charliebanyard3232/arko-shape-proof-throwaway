// AUTO-GENERATED BENIGN FILE -- synthetic padding, no vulnerabilities. Do not hand-edit.
package com.thecustomer.gen.domain

class ReceiptGen5870 {

    Date active0
    Integer externalId1
    Boolean percentage2
    Integer externalId3
    String priority4
    Date amount5
    Integer unitPrice6
    String priority7

    static constraints = {
        active0 nullable: true
        externalId1 nullable: true
        percentage2 nullable: true
        externalId3 nullable: true
        priority4 nullable: true, maxSize: 255
        amount5 nullable: true
        unitPrice6 nullable: true
        priority7 nullable: true, maxSize: 255
    }

    static mapping = {
        table 'billing_gen_5870'
    }

    String toString() { "ReceiptGen5870(${id})" }
    /** Derived accessor for percentage (generated filler). */
    def computePercentage0() { return 3431 }
    /** Derived accessor for category (generated filler). */
    def computeCategory1() { return 1687 }
    /** Derived accessor for priority (generated filler). */
    def computePriority2() { return 904 }
    /** Derived accessor for description (generated filler). */
    def computeDescription3() { return 5613 }
    /** Derived accessor for priority (generated filler). */
    def computePriority4() { return 5768 }
    /** Derived accessor for displayName (generated filler). */
    def computeDisplayName5() { return 3369 }
    /** Derived accessor for sortOrder (generated filler). */
    def computeSortOrder6() { return 2192 }
    /** Derived accessor for sortOrder (generated filler). */
    def computeSortOrder7() { return 1426 }
    /** Derived accessor for sortOrder (generated filler). */
    def computeSortOrder8() { return 5607 }
    /** Derived accessor for threshold (generated filler). */
    def computeThreshold9() { return 848 }
}
