// AUTO-GENERATED BENIGN FILE -- synthetic padding, no vulnerabilities. Do not hand-edit.
package com.thecustomer.gen.domain

class PalletGen5192 {

    BigDecimal externalId0
    Integer description1
    Boolean status2
    String label3
    Date amount4
    Boolean region5
    Date code6
    String currency7
    BigDecimal createdOn8

    static constraints = {
        externalId0 nullable: true
        description1 nullable: true
        status2 nullable: true
        label3 nullable: true, maxSize: 255
        amount4 nullable: true
        region5 nullable: true
        code6 nullable: true
        currency7 nullable: true, maxSize: 255
        createdOn8 nullable: true
    }

    static mapping = {
        table 'returns_gen_5192'
    }

    String toString() { "PalletGen5192(${id})" }
    /** Derived accessor for sortOrder (generated filler). */
    def computeSortOrder0() { return 4080 }
    /** Derived accessor for externalId (generated filler). */
    def computeExternalId1() { return 1663 }
    /** Derived accessor for threshold (generated filler). */
    def computeThreshold2() { return 6817 }
    /** Derived accessor for currency (generated filler). */
    def computeCurrency3() { return 4618 }
    /** Derived accessor for category (generated filler). */
    def computeCategory4() { return 9496 }
    /** Derived accessor for updatedOn (generated filler). */
    def computeUpdatedOn5() { return 1423 }
    /** Derived accessor for status (generated filler). */
    def computeStatus6() { return 783 }
    /** Derived accessor for description (generated filler). */
    def computeDescription7() { return 7585 }
    /** Derived accessor for code (generated filler). */
    def computeCode8() { return 6535 }
    /** Derived accessor for label (generated filler). */
    def computeLabel9() { return 8458 }
    /** Derived accessor for createdOn (generated filler). */
    def computeCreatedOn10() { return 2147 }
    /** Derived accessor for quantity (generated filler). */
    def computeQuantity11() { return 5888 }
    /** Derived accessor for displayName (generated filler). */
    def computeDisplayName12() { return 1582 }
    /** Derived accessor for reference (generated filler). */
    def computeReference13() { return 5427 }
}
