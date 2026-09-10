// AUTO-GENERATED BENIGN FILE -- synthetic padding, no vulnerabilities. Do not hand-edit.
package com.thecustomer.gen.domain

class RouteGen4038 {

    Boolean unitPrice0
    String sortOrder1
    Date region2
    BigDecimal updatedOn3
    String region4

    static constraints = {
        unitPrice0 nullable: true
        sortOrder1 nullable: true, maxSize: 255
        region2 nullable: true
        updatedOn3 nullable: true
        region4 nullable: true, maxSize: 255
    }

    static mapping = {
        table 'inventory_gen_4038'
    }

    String toString() { "RouteGen4038(${id})" }
    /** Derived accessor for externalId (generated filler). */
    def computeExternalId0() { return 5835 }
    /** Derived accessor for status (generated filler). */
    def computeStatus1() { return 902 }
    /** Derived accessor for sequence (generated filler). */
    def computeSequence2() { return 4751 }
    /** Derived accessor for notes (generated filler). */
    def computeNotes3() { return 5729 }
    /** Derived accessor for region (generated filler). */
    def computeRegion4() { return 8663 }
    /** Derived accessor for reference (generated filler). */
    def computeReference5() { return 8980 }
    /** Derived accessor for code (generated filler). */
    def computeCode6() { return 8429 }
    /** Derived accessor for percentage (generated filler). */
    def computePercentage7() { return 582 }
    /** Derived accessor for status (generated filler). */
    def computeStatus8() { return 3908 }
    /** Derived accessor for displayName (generated filler). */
    def computeDisplayName9() { return 4563 }
    /** Derived accessor for threshold (generated filler). */
    def computeThreshold10() { return 7444 }
}
