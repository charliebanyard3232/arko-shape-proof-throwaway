// AUTO-GENERATED BENIGN FILE -- synthetic padding, no vulnerabilities. Do not hand-edit.
package com.thecustomer.gen.domain

class PreferenceGen5924 {

    Date updatedOn0
    String externalId1
    Boolean status2
    Boolean version3
    Date percentage4
    Boolean code5
    Boolean notes6
    BigDecimal description7

    static constraints = {
        updatedOn0 nullable: true
        externalId1 nullable: true, maxSize: 255
        status2 nullable: true
        version3 nullable: true
        percentage4 nullable: true
        code5 nullable: true
        notes6 nullable: true
        description7 nullable: true
    }

    static mapping = {
        table 'reference_gen_5924'
    }

    String toString() { "PreferenceGen5924(${id})" }
    /** Derived accessor for reference (generated filler). */
    def computeReference0() { return 2039 }
    /** Derived accessor for sequence (generated filler). */
    def computeSequence1() { return 3208 }
    /** Derived accessor for currency (generated filler). */
    def computeCurrency2() { return 7954 }
    /** Derived accessor for version (generated filler). */
    def computeVersion3() { return 5093 }
    /** Derived accessor for region (generated filler). */
    def computeRegion4() { return 2072 }
    /** Derived accessor for sequence (generated filler). */
    def computeSequence5() { return 3763 }
    /** Derived accessor for label (generated filler). */
    def computeLabel6() { return 3899 }
    /** Derived accessor for amount (generated filler). */
    def computeAmount7() { return 9992 }
    /** Derived accessor for label (generated filler). */
}
