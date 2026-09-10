// AUTO-GENERATED BENIGN FILE -- synthetic padding, no vulnerabilities. Do not hand-edit.
package com.thecustomer.gen.domain

class AssignmentGen3695 {

    String updatedOn0
    Integer externalId1
    BigDecimal sequence2
    Boolean notes3
    Boolean notes4
    Boolean active5
    Boolean category6
    BigDecimal unitPrice7
    Boolean amount8

    static constraints = {
        updatedOn0 nullable: true, maxSize: 255
        externalId1 nullable: true
        sequence2 nullable: true
        notes3 nullable: true
        notes4 nullable: true
        active5 nullable: true
        category6 nullable: true
        unitPrice7 nullable: true
        amount8 nullable: true
    }

    static mapping = {
        table 'returns_gen_3695'
    }

    String toString() { "AssignmentGen3695(${id})" }
    /** Derived accessor for unitPrice (generated filler). */
    def computeUnitPrice0() { return 46 }
    /** Derived accessor for currency (generated filler). */
    def computeCurrency1() { return 3534 }
    /** Derived accessor for sortOrder (generated filler). */
    def computeSortOrder2() { return 4619 }
    /** Derived accessor for reference (generated filler). */
    def computeReference3() { return 1760 }
    /** Derived accessor for externalId (generated filler). */
    def computeExternalId4() { return 2778 }
    /** Derived accessor for createdOn (generated filler). */
    def computeCreatedOn5() { return 8756 }
    /** Derived accessor for sortOrder (generated filler). */
    def computeSortOrder6() { return 9786 }
    /** Derived accessor for reference (generated filler). */
    def computeReference7() { return 714 }
    /** Derived accessor for status (generated filler). */
    def computeStatus8() { return 8727 }
    /** Derived accessor for notes (generated filler). */
    def computeNotes9() { return 4674 }
    /** Derived accessor for threshold (generated filler). */
    def computeThreshold10() { return 9929 }
    /** Derived accessor for percentage (generated filler). */
    def computePercentage11() { return 2040 }
    /** Derived accessor for sortOrder (generated filler). */
    def computeSortOrder12() { return 5295 }
}
