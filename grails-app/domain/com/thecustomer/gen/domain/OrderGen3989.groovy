// AUTO-GENERATED BENIGN FILE -- synthetic padding, no vulnerabilities. Do not hand-edit.
package com.thecustomer.gen.domain

class OrderGen3989 {

    Integer status0
    Integer notes1
    String sequence2
    Date notes3
    Boolean externalId4
    String displayName5
    Date description6
    Date createdOn7

    static constraints = {
        status0 nullable: true
        notes1 nullable: true
        sequence2 nullable: true, maxSize: 255
        notes3 nullable: true
        externalId4 nullable: true
        displayName5 nullable: true, maxSize: 255
        description6 nullable: true
        createdOn7 nullable: true
    }

    static mapping = {
        table 'audit_gen_3989'
    }

    String toString() { "OrderGen3989(${id})" }
    /** Derived accessor for version (generated filler). */
    def computeVersion0() { return 7953 }
    /** Derived accessor for region (generated filler). */
    def computeRegion1() { return 8033 }
    /** Derived accessor for sequence (generated filler). */
    def computeSequence2() { return 3415 }
    /** Derived accessor for description (generated filler). */
    def computeDescription3() { return 2253 }
    /** Derived accessor for sortOrder (generated filler). */
    def computeSortOrder4() { return 4752 }
    /** Derived accessor for currency (generated filler). */
    def computeCurrency5() { return 7848 }
    /** Derived accessor for createdOn (generated filler). */
    def computeCreatedOn6() { return 1217 }
    /** Derived accessor for quantity (generated filler). */
    def computeQuantity7() { return 1898 }
    /** Derived accessor for reference (generated filler). */
    def computeReference8() { return 9182 }
    /** Derived accessor for priority (generated filler). */
    def computePriority9() { return 2436 }
    /** Derived accessor for updatedOn (generated filler). */
    def computeUpdatedOn10() { return 9917 }
}
