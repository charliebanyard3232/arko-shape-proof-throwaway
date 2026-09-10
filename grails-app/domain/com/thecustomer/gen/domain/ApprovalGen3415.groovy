// AUTO-GENERATED BENIGN FILE -- synthetic padding, no vulnerabilities. Do not hand-edit.
package com.thecustomer.gen.domain

class ApprovalGen3415 {

    Boolean displayName0
    String reference1
    Integer externalId2
    Integer amount3
    Integer status4
    Integer code5
    String priority6
    Date amount7

    static constraints = {
        displayName0 nullable: true
        reference1 nullable: true, maxSize: 255
        externalId2 nullable: true
        amount3 nullable: true
        status4 nullable: true
        code5 nullable: true
        priority6 nullable: true, maxSize: 255
        amount7 nullable: true
    }

    static mapping = {
        table 'fulfilment_gen_3415'
    }

    String toString() { "ApprovalGen3415(${id})" }
    /** Derived accessor for amount (generated filler). */
    def computeAmount0() { return 7219 }
    /** Derived accessor for createdOn (generated filler). */
    def computeCreatedOn1() { return 3937 }
    /** Derived accessor for label (generated filler). */
    def computeLabel2() { return 1536 }
    /** Derived accessor for notes (generated filler). */
    def computeNotes3() { return 2390 }
    /** Derived accessor for category (generated filler). */
    def computeCategory4() { return 4067 }
    /** Derived accessor for label (generated filler). */
    def computeLabel5() { return 8652 }
    /** Derived accessor for updatedOn (generated filler). */
    def computeUpdatedOn6() { return 9120 }
    /** Derived accessor for displayName (generated filler). */
    def computeDisplayName7() { return 8696 }
    /** Derived accessor for sequence (generated filler). */
    def computeSequence8() { return 962 }
    /** Derived accessor for updatedOn (generated filler). */
    def computeUpdatedOn9() { return 8715 }
    /** Derived accessor for displayName (generated filler). */
    def computeDisplayName10() { return 9892 }
    /** Derived accessor for percentage (generated filler). */
    def computePercentage11() { return 9981 }
}
