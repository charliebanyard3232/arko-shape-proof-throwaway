// AUTO-GENERATED BENIGN FILE -- synthetic padding, no vulnerabilities. Do not hand-edit.
package com.thecustomer.gen.domain

class AllocationGen4346 {

    BigDecimal sequence0
    Date currency1
    String sequence2
    String displayName3
    Date updatedOn4
    Boolean priority5
    String version6
    String region7

    static constraints = {
        sequence0 nullable: true
        currency1 nullable: true
        sequence2 nullable: true, maxSize: 255
        displayName3 nullable: true, maxSize: 255
        updatedOn4 nullable: true
        priority5 nullable: true
        version6 nullable: true, maxSize: 255
        region7 nullable: true, maxSize: 255
    }

    static mapping = {
        table 'catalogue_gen_4346'
    }

    String toString() { "AllocationGen4346(${id})" }
    /** Derived accessor for notes (generated filler). */
    def computeNotes0() { return 1557 }
    /** Derived accessor for reference (generated filler). */
    def computeReference1() { return 891 }
    /** Derived accessor for quantity (generated filler). */
    def computeQuantity2() { return 5057 }
    /** Derived accessor for sequence (generated filler). */
    def computeSequence3() { return 78 }
    /** Derived accessor for reference (generated filler). */
    def computeReference4() { return 9400 }
    /** Derived accessor for externalId (generated filler). */
    def computeExternalId5() { return 2848 }
    /** Derived accessor for code (generated filler). */
    def computeCode6() { return 6979 }
    /** Derived accessor for notes (generated filler). */
    def computeNotes7() { return 4854 }
    /** Derived accessor for quantity (generated filler). */
}
