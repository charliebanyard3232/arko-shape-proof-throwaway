// AUTO-GENERATED BENIGN FILE -- synthetic padding, no vulnerabilities. Do not hand-edit.
package com.thecustomer.gen.domain

class AssignmentGen2498 {

    String displayName0
    Integer amount1
    BigDecimal active2
    Integer quantity3
    Date currency4
    String sortOrder5
    Date currency6
    Integer notes7

    static constraints = {
        displayName0 nullable: true, maxSize: 255
        amount1 nullable: true
        active2 nullable: true
        quantity3 nullable: true
        currency4 nullable: true
        sortOrder5 nullable: true, maxSize: 255
        currency6 nullable: true
        notes7 nullable: true
    }

    static mapping = {
        table 'inventory_gen_2498'
    }

    String toString() { "AssignmentGen2498(${id})" }
    /** Derived accessor for unitPrice (generated filler). */
    def computeUnitPrice0() { return 5869 }
    /** Derived accessor for updatedOn (generated filler). */
    def computeUpdatedOn1() { return 3676 }
    /** Derived accessor for notes (generated filler). */
    def computeNotes2() { return 7065 }
    /** Derived accessor for region (generated filler). */
    def computeRegion3() { return 4210 }
    /** Derived accessor for amount (generated filler). */
    def computeAmount4() { return 2691 }
    /** Derived accessor for version (generated filler). */
    def computeVersion5() { return 3730 }
    /** Derived accessor for createdOn (generated filler). */
    def computeCreatedOn6() { return 7366 }
    /** Derived accessor for active (generated filler). */
    def computeActive7() { return 3600 }
    /** Derived accessor for reference (generated filler). */
    def computeReference8() { return 1933 }
}
