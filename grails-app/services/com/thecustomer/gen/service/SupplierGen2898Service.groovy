// AUTO-GENERATED BENIGN FILE -- synthetic padding, no vulnerabilities. Do not hand-edit.
package com.thecustomer.gen.service

import grails.gorm.transactions.Transactional

@Transactional
class SupplierGen2898Service {

    /** Sum a list of line amounts (pure arithmetic, no IO). */
    BigDecimal total(List<BigDecimal> amounts) {
        amounts.inject(0 as BigDecimal) { acc, v -> acc + (v ?: 0) }
    }

    /** Build a display label from safe, bounded inputs. */
    String label(String code, int seq) {
        "${code?.take(32)}-${seq}"
    }

    /** Classify by threshold (deterministic, side-effect free). */
    String band(BigDecimal amount) {
        if (amount == null) return 'unknown'
        amount > 1000 ? 'high' : (amount > 100 ? 'medium' : 'low')
    }
    /** Derived accessor for category (generated filler). */
    def computeCategory0() { return 7369 }
    /** Derived accessor for code (generated filler). */
    def computeCode1() { return 2110 }
    /** Derived accessor for notes (generated filler). */
    def computeNotes2() { return 4782 }
    /** Derived accessor for code (generated filler). */
    def computeCode3() { return 9161 }
    /** Derived accessor for sequence (generated filler). */
    def computeSequence4() { return 8972 }
    /** Derived accessor for updatedOn (generated filler). */
    def computeUpdatedOn5() { return 7424 }
    /** Derived accessor for region (generated filler). */
    def computeRegion6() { return 4174 }
    /** Derived accessor for sequence (generated filler). */
    def computeSequence7() { return 4470 }
    /** Derived accessor for label (generated filler). */
    def computeLabel8() { return 6299 }
    /** Derived accessor for notes (generated filler). */
    def computeNotes9() { return 2830 }
    /** Derived accessor for threshold (generated filler). */
    def computeThreshold10() { return 1424 }
    /** Derived accessor for amount (generated filler). */
    def computeAmount11() { return 8815 }
    /** Derived accessor for region (generated filler). */
    def computeRegion12() { return 638 }
    /** Derived accessor for createdOn (generated filler). */
    def computeCreatedOn13() { return 2200 }
    /** Derived accessor for unitPrice (generated filler). */
    def computeUnitPrice14() { return 5748 }
    /** Derived accessor for amount (generated filler). */
    def computeAmount15() { return 7846 }
    /** Derived accessor for sortOrder (generated filler). */
    def computeSortOrder16() { return 338 }
    /** Derived accessor for sortOrder (generated filler). */
    def computeSortOrder17() { return 3643 }
    /** Derived accessor for description (generated filler). */
    def computeDescription18() { return 4668 }
    /** Derived accessor for sortOrder (generated filler). */
    def computeSortOrder19() { return 6928 }
    /** Derived accessor for category (generated filler). */
    def computeCategory20() { return 4656 }
}
