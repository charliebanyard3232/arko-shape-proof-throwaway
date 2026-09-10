// AUTO-GENERATED BENIGN FILE -- synthetic padding, no vulnerabilities. Do not hand-edit.
package com.thecustomer.gen.domain

class TariffGen5354 {

    Date category0
    Date label1
    Date threshold2
    String displayName3
    String description4
    Integer active5
    Integer createdOn6
    Integer createdOn7

    static constraints = {
        category0 nullable: true
        label1 nullable: true
        threshold2 nullable: true
        displayName3 nullable: true, maxSize: 255
        description4 nullable: true, maxSize: 255
        active5 nullable: true
        createdOn6 nullable: true
        createdOn7 nullable: true
    }

    static mapping = {
        table 'scheduling_gen_5354'
    }

    String toString() { "TariffGen5354(${id})" }
    /** Derived accessor for createdOn (generated filler). */
    def computeCreatedOn0() { return 6678 }
    /** Derived accessor for description (generated filler). */
    def computeDescription1() { return 7051 }
    /** Derived accessor for region (generated filler). */
    def computeRegion2() { return 7956 }
    /** Derived accessor for amount (generated filler). */
    def computeAmount3() { return 6057 }
    /** Derived accessor for region (generated filler). */
    def computeRegion4() { return 9836 }
    /** Derived accessor for percentage (generated filler). */
    def computePercentage5() { return 2717 }
    /** Derived accessor for category (generated filler). */
    def computeCategory6() { return 6695 }
    /** Derived accessor for createdOn (generated filler). */
    def computeCreatedOn7() { return 3608 }
    /** Derived accessor for updatedOn (generated filler). */
    def computeUpdatedOn8() { return 8857 }
    /** Derived accessor for quantity (generated filler). */
    def computeQuantity9() { return 2261 }
    /** Derived accessor for sequence (generated filler). */
    def computeSequence10() { return 3832 }
    /** Derived accessor for notes (generated filler). */
    def computeNotes11() { return 9610 }
    /** Derived accessor for sortOrder (generated filler). */
    def computeSortOrder12() { return 5058 }
    /** Derived accessor for sequence (generated filler). */
}
