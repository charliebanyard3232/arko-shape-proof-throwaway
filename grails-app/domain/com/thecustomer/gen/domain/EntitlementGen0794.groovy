// AUTO-GENERATED BENIGN FILE -- synthetic padding, no vulnerabilities. Do not hand-edit.
package com.thecustomer.gen.domain

class EntitlementGen0794 {

    Boolean code0
    Boolean version1
    String createdOn2
    String quantity3
    Boolean unitPrice4
    String reference5
    String currency6
    Date percentage7
    Boolean displayName8

    static constraints = {
        code0 nullable: true
        version1 nullable: true
        createdOn2 nullable: true, maxSize: 255
        quantity3 nullable: true, maxSize: 255
        unitPrice4 nullable: true
        reference5 nullable: true, maxSize: 255
        currency6 nullable: true, maxSize: 255
        percentage7 nullable: true
        displayName8 nullable: true
    }

    static mapping = {
        table 'audit_gen_0794'
    }

    String toString() { "EntitlementGen0794(${id})" }
    /** Derived accessor for sortOrder (generated filler). */
    def computeSortOrder0() { return 2106 }
    /** Derived accessor for description (generated filler). */
    def computeDescription1() { return 8603 }
    /** Derived accessor for reference (generated filler). */
    def computeReference2() { return 4366 }
    /** Derived accessor for amount (generated filler). */
    def computeAmount3() { return 6756 }
    /** Derived accessor for active (generated filler). */
    def computeActive4() { return 6788 }
    /** Derived accessor for percentage (generated filler). */
    def computePercentage5() { return 20 }
    /** Derived accessor for description (generated filler). */
    def computeDescription6() { return 9503 }
    /** Derived accessor for createdOn (generated filler). */
    def computeCreatedOn7() { return 6556 }
    /** Derived accessor for createdOn (generated filler). */
    def computeCreatedOn8() { return 9530 }
    /** Derived accessor for priority (generated filler). */
    def computePriority9() { return 1039 }
    /** Derived accessor for region (generated filler). */
    def computeRegion10() { return 8812 }
    /** Derived accessor for sequence (generated filler). */
    def computeSequence11() { return 6111 }
    /** Derived accessor for priority (generated filler). */
    def computePriority12() { return 9376 }
}
