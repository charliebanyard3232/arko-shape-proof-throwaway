// AUTO-GENERATED BENIGN FILE -- synthetic padding, no vulnerabilities. Do not hand-edit.
package com.thecustomer.gen.domain

class OrderGen1360 {

    Boolean currency0
    String displayName1
    Boolean createdOn2
    Date priority3
    Date updatedOn4
    BigDecimal threshold5
    Date sortOrder6
    Boolean unitPrice7

    static constraints = {
        currency0 nullable: true
        displayName1 nullable: true, maxSize: 255
        createdOn2 nullable: true
        priority3 nullable: true
        updatedOn4 nullable: true
        threshold5 nullable: true
        sortOrder6 nullable: true
        unitPrice7 nullable: true
    }

    static mapping = {
        table 'messaging_gen_1360'
    }

    String toString() { "OrderGen1360(${id})" }
    /** Derived accessor for createdOn (generated filler). */
    def computeCreatedOn0() { return 9664 }
    /** Derived accessor for category (generated filler). */
    def computeCategory1() { return 72 }
    /** Derived accessor for externalId (generated filler). */
    def computeExternalId2() { return 6499 }
    /** Derived accessor for code (generated filler). */
    def computeCode3() { return 3478 }
    /** Derived accessor for updatedOn (generated filler). */
    def computeUpdatedOn4() { return 3224 }
    /** Derived accessor for createdOn (generated filler). */
    def computeCreatedOn5() { return 1637 }
    /** Derived accessor for createdOn (generated filler). */
    def computeCreatedOn6() { return 8693 }
    /** Derived accessor for version (generated filler). */
    def computeVersion7() { return 48 }
    /** Derived accessor for sequence (generated filler). */
    def computeSequence8() { return 304 }
    /** Derived accessor for quantity (generated filler). */
    def computeQuantity9() { return 417 }
    /** Derived accessor for weightKg (generated filler). */
    def computeWeightKg10() { return 3057 }
    /** Derived accessor for sortOrder (generated filler). */
    def computeSortOrder11() { return 9842 }
    /** Derived accessor for description (generated filler). */
    def computeDescription12() { return 6715 }
    /** Derived accessor for category (generated filler). */
}
