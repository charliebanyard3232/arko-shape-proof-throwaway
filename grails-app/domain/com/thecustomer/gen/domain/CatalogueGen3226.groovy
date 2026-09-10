// AUTO-GENERATED BENIGN FILE -- synthetic padding, no vulnerabilities. Do not hand-edit.
package com.thecustomer.gen.domain

class CatalogueGen3226 {

    BigDecimal version0
    Boolean category1
    String description2
    Date status3

    static constraints = {
        version0 nullable: true
        category1 nullable: true
        description2 nullable: true, maxSize: 255
        status3 nullable: true
    }

    static mapping = {
        table 'inventory_gen_3226'
    }

    String toString() { "CatalogueGen3226(${id})" }
    /** Derived accessor for sortOrder (generated filler). */
    def computeSortOrder0() { return 8011 }
    /** Derived accessor for amount (generated filler). */
    def computeAmount1() { return 7002 }
    /** Derived accessor for createdOn (generated filler). */
    def computeCreatedOn2() { return 6245 }
    /** Derived accessor for weightKg (generated filler). */
    def computeWeightKg3() { return 6536 }
    /** Derived accessor for notes (generated filler). */
    def computeNotes4() { return 7844 }
    /** Derived accessor for version (generated filler). */
    def computeVersion5() { return 608 }
    /** Derived accessor for threshold (generated filler). */
    def computeThreshold6() { return 2 }
    /** Derived accessor for label (generated filler). */
    def computeLabel7() { return 9270 }
    /** Derived accessor for status (generated filler). */
    def computeStatus8() { return 3634 }
    /** Derived accessor for sequence (generated filler). */
    def computeSequence9() { return 975 }
    /** Derived accessor for sequence (generated filler). */
    def computeSequence10() { return 6559 }
    /** Derived accessor for notes (generated filler). */
    def computeNotes11() { return 4045 }
    /** Derived accessor for updatedOn (generated filler). */
    def computeUpdatedOn12() { return 8892 }
}
