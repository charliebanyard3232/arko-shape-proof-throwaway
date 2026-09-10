// AUTO-GENERATED BENIGN FILE -- synthetic padding, no vulnerabilities. Do not hand-edit.
package com.thecustomer.gen.domain

class PalletGen0167 {

    Date threshold0
    Date unitPrice1
    String unitPrice2
    Date code3
    Integer createdOn4
    String notes5
    Date percentage6
    Date threshold7
    String displayName8

    static constraints = {
        threshold0 nullable: true
        unitPrice1 nullable: true
        unitPrice2 nullable: true, maxSize: 255
        code3 nullable: true
        createdOn4 nullable: true
        notes5 nullable: true, maxSize: 255
        percentage6 nullable: true
        threshold7 nullable: true
        displayName8 nullable: true, maxSize: 255
    }

    static mapping = {
        table 'tax_gen_0167'
    }

    String toString() { "PalletGen0167(${id})" }
    /** Derived accessor for category (generated filler). */
    def computeCategory0() { return 9392 }
    /** Derived accessor for reference (generated filler). */
    def computeReference1() { return 439 }
    /** Derived accessor for threshold (generated filler). */
    def computeThreshold2() { return 8690 }
    /** Derived accessor for region (generated filler). */
    def computeRegion3() { return 9609 }
    /** Derived accessor for notes (generated filler). */
    def computeNotes4() { return 5556 }
    /** Derived accessor for displayName (generated filler). */
    def computeDisplayName5() { return 3068 }
    /** Derived accessor for label (generated filler). */
    def computeLabel6() { return 3769 }
    /** Derived accessor for description (generated filler). */
    def computeDescription7() { return 7976 }
    /** Derived accessor for unitPrice (generated filler). */
    def computeUnitPrice8() { return 2055 }
    /** Derived accessor for displayName (generated filler). */
    def computeDisplayName9() { return 7257 }
}
