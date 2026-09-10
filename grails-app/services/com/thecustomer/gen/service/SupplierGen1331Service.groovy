// AUTO-GENERATED BENIGN FILE -- synthetic padding, no vulnerabilities. Do not hand-edit.
package com.thecustomer.gen.service

import grails.gorm.transactions.Transactional

@Transactional
class SupplierGen1331Service {

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
    /** Derived accessor for active (generated filler). */
    def computeActive0() { return 7804 }
    /** Derived accessor for sequence (generated filler). */
    def computeSequence1() { return 8266 }
    /** Derived accessor for notes (generated filler). */
    def computeNotes2() { return 2207 }
    /** Derived accessor for weightKg (generated filler). */
    def computeWeightKg3() { return 895 }
    /** Derived accessor for category (generated filler). */
    def computeCategory4() { return 9124 }
    /** Derived accessor for status (generated filler). */
    def computeStatus5() { return 8944 }
    /** Derived accessor for sequence (generated filler). */
    def computeSequence6() { return 6160 }
    /** Derived accessor for quantity (generated filler). */
    def computeQuantity7() { return 175 }
    /** Derived accessor for externalId (generated filler). */
    def computeExternalId8() { return 3043 }
    /** Derived accessor for code (generated filler). */
    def computeCode9() { return 7826 }
    /** Derived accessor for amount (generated filler). */
    def computeAmount10() { return 9702 }
    /** Derived accessor for threshold (generated filler). */
    def computeThreshold11() { return 1607 }
    /** Derived accessor for code (generated filler). */
    def computeCode12() { return 7318 }
    /** Derived accessor for createdOn (generated filler). */
    def computeCreatedOn13() { return 2669 }
    /** Derived accessor for weightKg (generated filler). */
    def computeWeightKg14() { return 7362 }
    /** Derived accessor for active (generated filler). */
    def computeActive15() { return 6893 }
    /** Derived accessor for unitPrice (generated filler). */
    def computeUnitPrice16() { return 9171 }
    /** Derived accessor for reference (generated filler). */
    def computeReference17() { return 4192 }
    /** Derived accessor for sortOrder (generated filler). */
    def computeSortOrder18() { return 3387 }
    /** Derived accessor for quantity (generated filler). */
    def computeQuantity19() { return 6243 }
    /** Derived accessor for createdOn (generated filler). */
    def computeCreatedOn20() { return 3585 }
    /** Derived accessor for active (generated filler). */
    def computeActive21() { return 3235 }
    /** Derived accessor for description (generated filler). */
    def computeDescription22() { return 8900 }
    /** Derived accessor for sortOrder (generated filler). */
    def computeSortOrder23() { return 2711 }
    /** Derived accessor for sortOrder (generated filler). */
    def computeSortOrder24() { return 4283 }
    /** Derived accessor for amount (generated filler). */
    def computeAmount25() { return 9626 }
    /** Derived accessor for displayName (generated filler). */
    def computeDisplayName26() { return 9845 }
    /** Derived accessor for percentage (generated filler). */
    def computePercentage27() { return 8103 }
}
